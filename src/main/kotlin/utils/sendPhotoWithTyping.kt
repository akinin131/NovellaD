package utils

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatAction
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.network.bimap
import com.github.kotlintelegrambot.network.fold
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

suspend fun sendPhotoWithTyping(
    chatId: ChatId,
    photoUrl: String,
    caption: String,
    bot: Bot
) {
    if (BotStateFactory.isExecutingPhoto(photoUrl)) {
        return
    }

    BotStateFactory.setExecutingPhoto(photoUrl, true)
    try {
        val typingSent = withContext(Dispatchers.IO) {
            bot.sendChatAction(chatId, ChatAction.UPLOAD_PHOTO)
        }.bimap(
            { true },
            { error ->
                println("Error sending typing action: $error")
                false
            }
        )

        if (typingSent) {
            delay(9_000)
            withContext(Dispatchers.IO) {
                bot.sendPhoto(
                    chatId = chatId,
                    photo = photoUrl,
                    caption = caption
                ).fold({}, { error ->
                    println("Error sending photo: $error")
                })
            }
        }
    } finally {
        BotStateFactory.setExecutingPhoto(photoUrl, false)
    }
}
