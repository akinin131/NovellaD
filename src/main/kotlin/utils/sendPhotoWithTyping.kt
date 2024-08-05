package utils

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatAction
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.network.fold

suspend fun sendPhotoWithTyping(
    chatId: ChatId,
    photoUrl: String,
    caption: String,
    bot: Bot
) {
    if (BotStateFactory.isExecutingPhoto(photoUrl)) {
        return
    }

    if (BotStateFactory.isExecutingPhoto(photoUrl)) {
        return
    } else {
        BotStateFactory.setExecutingPhoto(photoUrl, true)
        try {
            bot.sendChatAction(chatId, ChatAction.UPLOAD_PHOTO).fold({
                Thread.sleep(9000)
                bot.sendPhoto(
                    chatId = chatId,
                    photo = photoUrl,
                    caption = caption
                ).fold({
                }, {
                    println("Error sending photo: $it")
                })
            }, {
                println("Error sending typing action: $it")

            })
        } finally {
            BotStateFactory.setExecutingPhoto(photoUrl, false)
        }
    }
}