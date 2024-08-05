package utils

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatAction
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.ParseMode
import com.github.kotlintelegrambot.network.fold

suspend fun sendMessageWithTyping(
    chatId: ChatId,
    text: String,
    bot: Bot,
    inlineKeyboardMarkup: KeyboardReplyMarkup? = null
) {
    if (BotStateFactory.isExecuting(text)) {
        return
    }
    if (BotStateFactory.executingTexts?.containsKey(text) == true) {
        return
    } else {
        BotStateFactory.setExecuting(text, true)

        try {
            bot.sendChatAction(chatId, ChatAction.TYPING).fold({
                sleepRandomTime(3, 6)
                bot.sendMessage(
                    chatId = chatId,
                    text = text,
                    parseMode = ParseMode.HTML,
                    replyMarkup = inlineKeyboardMarkup
                )
            }, {
                println("Error sending typing action: $it")
            })
        } finally {
            BotStateFactory.setExecuting(text, false)
        }
    }
}

suspend fun sendMessageWithTyping10(
    chatId: ChatId,
    text: String,
    bot: Bot,
    inlineKeyboardMarkup: KeyboardReplyMarkup? = null
) {
    if (BotStateFactory.isExecuting(text)) {
        return
    }
    if (BotStateFactory.executingTexts?.containsKey(text) == true) {
        return
    } else {
        BotStateFactory.setExecuting(text, true)

        try {
            bot.sendChatAction(chatId, ChatAction.TYPING).fold({
                sleepRandomTime(10, 12)
                bot.sendMessage(
                    chatId = chatId,
                    text = text,
                    parseMode = ParseMode.HTML,
                    replyMarkup = inlineKeyboardMarkup
                )
            }, {
                println("Error sending typing action: $it")
            })
        } finally {
            BotStateFactory.setExecuting(text, false)
        }
    }
}