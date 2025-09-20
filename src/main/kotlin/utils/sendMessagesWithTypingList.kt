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
import com.github.kotlintelegrambot.entities.ParseMode
import com.github.kotlintelegrambot.network.bimap
import com.github.kotlintelegrambot.network.fold
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

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
                    sleepRandomTime(4, 7)
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
    }
}
