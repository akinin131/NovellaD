@file:Suppress("UNREACHABLE_CODE")

import Lavel_1.InitialStateLableOne
import Lavel_3.handleSuccessfulPayment
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.*
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.logging.LogLevel
import com.github.kotlintelegrambot.types.TelegramBotResult
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

fun main() {
    val myBot = MyBot()
    myBot.createBot().startPolling()
}

class MyBot {
    private var currentState: BotState = InitialStateLableOne()

    fun createBot(): Bot {
        return bot {
            token = "7289060186:AAEC372I81ofvBPoBPfv99dCWSow_v5vVmE"
            logLevel = LogLevel.Network.Body

            dispatch {
                text {
                    val text = update.message?.text

                    if (text != null) {
                        val chatId = ChatId.fromId(update.message!!.chat.id)
                        val userId = update.message!!.from?.id
                        val chatIdQroup = ChatId.fromId(-1002229947613)

                        val result = bot.getChatMember(chatIdQroup, userId!!.toLong())

                        println("result111 = $result")
                        // Переместите вызов addDocumentToCollection сюда
                        GlobalScope.launch {
                            handleTextAndUpdateState(chatId, text, bot, result)
                        }
                    }

                    callbackQuery("check_subscription") {
                        val chatId = callbackQuery.message?.chat?.id
                        val userId = callbackQuery.from.id

                        if (chatId != null) {
                            val chatIdGroup = ChatId.fromId(-1002229947613L)

                            val result = bot.getChatMember(chatIdGroup, userId.toLong())

                            result.fold(
                                {
                                    val chatMember = it
                                    if (chatMember.status == "member" || chatMember.status == "administrator" || chatMember.status == "creator") {
                                        bot.sendMessage(ChatId.fromId(chatId), "✅ Подписка подтверждена! Спасибо!")
                                        bot.deleteMessage(ChatId.fromId(chatId), callbackQuery.message?.messageId!!)
                                    } else {
                                        bot.sendMessage(ChatId.fromId(chatId), "❌ Вы не подписаны на группу. Пожалуйста, подпишитесь и попробуйте снова.")
                                    }
                                },
                                {
                                    bot.sendMessage(ChatId.fromId(chatId), "Произошла ошибка при проверке подписки.")
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

                // Обработка успешных платежей
                message {
                    val successfulPayment = this.message.successfulPayment
                    if (successfulPayment != null) {
                        runBlocking {
                            handleSuccessfulPayment( bot, message, ChatId.fromId(update.message!!.chat.id))
                        }
                    }
                }
            }
        }
    }


    private suspend fun handleTextAndUpdateState(
        chatId: ChatId,
        text: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        supervisorScope {
                val newState = BotStateFactory.getState(text)
                if (newState != null) {
                    currentState = newState
                }
            println(newState)
            currentState.handleText(chatId, text, bot, result)
        }
    }
}