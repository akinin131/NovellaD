@file:Suppress("UNREACHABLE_CODE")

import Lavel_1.InitialStateLableOne
import Lavel_3.handleSuccessfulPayment
import com.example.Strings
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.logging.LogLevel
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.handlers.HandleUpdate
import com.github.kotlintelegrambot.dispatcher.message
import com.github.kotlintelegrambot.dispatcher.preCheckoutQuery
import com.github.kotlintelegrambot.dispatcher.text
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import com.github.kotlintelegrambot.entities.ChatId
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
            var username = "123"
            dispatch {
                text {
                    val text = update.message?.text

                    if (text != null) {
                        val chatId = ChatId.fromId(update.message!!.chat.id)
                        username = message.from?.username ?: "Unknown"
                        GlobalScope.launch {
                            handleTextAndUpdateState(chatId, text, bot)
                        }


                    }

                }
                initializeFirebase()

                addDocumentToCollection(ChatId.toString(), username)
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
                    val successfulPayment = this.message?.successfulPayment
                    if (successfulPayment != null) {
                        runBlocking {
                            handleSuccessfulPayment( bot, message, ChatId.fromId(update.message!!.chat.id))
                        }
                    }
                }
            }
        }
    }


    private suspend fun handleTextAndUpdateState(chatId: ChatId, text: String, bot: Bot) {
        supervisorScope {
                val newState = BotStateFactory.getState(text)
                if (newState != null) {
                    currentState = newState
                }
            println(newState)
            currentState.handleText(chatId, text, bot)
        }
    }
}