package utils

import com.example.Strings
import com.example.Strings.Emilywenttobed
import com.example.Strings.danInterruption
import com.example.Strings.emilyDepartureMessage
import com.example.Strings.photonGoodnight
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatAction
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.network.fold
import com.github.kotlintelegrambot.entities.ParseMode

suspend fun sendMessagesWithTypingList(
    chatId: ChatId,
    texts: List<String>,
    bot: Bot,
    inlineKeyboardMarkup: KeyboardReplyMarkup? = null
) {
    if (texts.isEmpty()) return

    for (text in texts) {
        if (BotStateFactory.isExecuting(text)) {
            return
        }
        if (BotStateFactory.executingTexts?.containsKey(text) == true) {
            return
        } else {
            BotStateFactory.setExecuting(text, true)

            try {
                bot.sendChatAction(chatId, ChatAction.TYPING).fold({
                    sleepRandomTime(4, 7)
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
}