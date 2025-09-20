package utils

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatAction
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.ParseMode
import com.github.kotlintelegrambot.network.bimap
import com.github.kotlintelegrambot.network.fold
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun sendMessageWithTyping(
    chatId: ChatId,
    text: String,
    bot: Bot,
    inlineKeyboardMarkup: KeyboardReplyMarkup? = null
) = sendMessageWithTypingInternal(chatId, text, bot, inlineKeyboardMarkup, 3..6)

suspend fun sendMessageWithTyping10(
    chatId: ChatId,
    text: String,
    bot: Bot,
    inlineKeyboardMarkup: KeyboardReplyMarkup? = null
) = sendMessageWithTypingInternal(chatId, text, bot, inlineKeyboardMarkup, 10..12)

private suspend fun sendMessageWithTypingInternal(
    chatId: ChatId,
    text: String,
    bot: Bot,
    inlineKeyboardMarkup: KeyboardReplyMarkup?,
    typingDelayRange: IntRange
) {
    if (BotStateFactory.isExecuting(text)) return
    if (BotStateFactory.executingTexts?.containsKey(text) == true) return

    BotStateFactory.setExecuting(text, true)

    try {
        val typingSent = withContext(Dispatchers.IO) {
            bot.sendChatAction(chatId, ChatAction.TYPING)
        }.bimap(
            { true },
            { error ->
                println("Error sending typing action: $error")
                false
            }
        )

        if (typingSent) {
            sleepRandomTime(typingDelayRange.first, typingDelayRange.last)
            withContext(Dispatchers.IO) {
                bot.sendMessage(
                    chatId = chatId,
                    text = text,
                    parseMode = ParseMode.HTML,
                    replyMarkup = inlineKeyboardMarkup
                ).fold({}, { error ->
                    println("Error sending message: $error")
                })
            }
        }
    } finally {
        BotStateFactory.setExecuting(text, false)
    }
}
