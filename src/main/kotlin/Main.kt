@file:Suppress("UNREACHABLE_CODE")

import Lavel_1.InitialStateLableOne
import Lavel_1.InitialStateLableOneT
import Lavel_3.handleSuccessfulPayment
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.*
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.logging.LogLevel
import com.github.kotlintelegrambot.types.TelegramBotResult
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope
import kotlinx.coroutines.*
import java.util.concurrent.ConcurrentHashMap

fun main() {
    val myBot = MyBot()
    myBot.createBot().startPolling()
}

class MyBot {
    private val userStates = ConcurrentHashMap<Long, BotState>()
    private val processedCallbackQueryIds = ConcurrentHashMap<String, Boolean>()
    private val botScope = CoroutineScope(Dispatchers.Default)

    fun createBot(): Bot {
        return bot {
            token = "7289060186:AAEypBnHeCG-OXO8sxJreb5RBTwLzuUJDW4"
            logLevel = LogLevel.Network.Body

            dispatch {
                text {
                    val text = update.message?.text
                    if (text != null) {
                        val chatIdValue = update.message!!.chat.id
                        val chatId = ChatId.fromId(chatIdValue)
                        val userId = update.message!!.from?.id
                        val chatIdGroup = ChatId.fromId(-1002229947613L)

                        botScope.launch(Dispatchers.IO) {
                            val result = bot.getChatMember(chatIdGroup, userId!!.toLong())
                            handleTextAndUpdateState(chatId, chatIdValue, text, userId.toString(), bot, result)
                        }
                    }
                }

                callbackQuery("check_subscription") {
                    val callbackId = callbackQuery.id
                    val chatIdValue = callbackQuery.message?.chat?.id
                    val userId = callbackQuery.from.id

                    if (chatIdValue != null && processedCallbackQueryIds.putIfAbsent(callbackId, true) == null) {
                        val chatIdGroup = ChatId.fromId(-1002229947613L)
                        botScope.launch(Dispatchers.IO) {
                            val result = bot.getChatMember(chatIdGroup, userId.toLong())
                            result.fold(
                                {
                                    val chatMember = it
                                    if (chatMember.status in listOf("member", "administrator", "creator")) {
                                        val chatId = ChatId.fromId(chatIdValue)
                                        bot.sendMessage(chatId, "✅ Подписка подтверждена! Спасибо!")
                                        bot.deleteMessage(chatId, callbackQuery.message?.messageId!!)
                                        handleTextAndUpdateState(
                                            chatId,
                                            chatIdValue,
                                            "✅ Подписка подтверждена! Спасибо!",
                                            userId.toString(),
                                            bot,
                                            result
                                        )
                                    } else {
                                        bot.sendMessage(ChatId.fromId(chatIdValue), "❌ Вы не подписаны на группу.")
                                    }
                                },
                                {
                                    bot.sendMessage(ChatId.fromId(chatIdValue), "Произошла ошибка при проверке подписки.")
                                }
                            )
                        }
                    }
                }

                initializeFirebase()

                preCheckoutQuery {
                    val preCheckoutQuery = this.preCheckoutQuery
                    runBlocking {
                        bot.answerPreCheckoutQuery(
                            preCheckoutQuery.id,
                            ok = true
                        )
                        println("PreCheckoutQuery confirmed")
                    }
                }

                message {
                    val successfulPayment = this.message.successfulPayment
                    if (successfulPayment != null) {
                        runBlocking {
                            handleSuccessfulPayment(bot, message, ChatId.fromId(update.message!!.chat.id))
                        }
                    }
                }
            }
        }
    }

    private suspend fun handleTextAndUpdateState(
        chatId: ChatId,
        chatKey: Long,
        text: String,
        userId: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        supervisorScope {
            val fallbackState = userStates[chatKey] ?: InitialStateLableOne()
            val nextState = BotStateFactory.getState(text) ?: fallbackState
            userStates[chatKey] = nextState
            nextState.handleText(chatId, text, userId, bot, result)
            if (nextState is InitialStateLableOneT) {
                userStates.remove(chatKey)
            }
        }
    }
}
