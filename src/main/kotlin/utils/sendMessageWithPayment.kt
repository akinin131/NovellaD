package utils

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.ParseMode
import org.telegram.telegrambots.meta.api.methods.invoices.SendInvoice

suspend fun sendMessageWithPayment(
    chatId: ChatId,
    text: SendInvoice,
    bot: Bot,
    inlineKeyboardMarkup: KeyboardReplyMarkup? = null
) {

    bot.sendMessage(
        chatId = chatId,
        text = text.toString(),
        parseMode = ParseMode.HTML,
        replyMarkup = inlineKeyboardMarkup
    )
}
