package utils

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.InlineKeyboardMarkup
import com.github.kotlintelegrambot.entities.keyboard.InlineKeyboardButton


fun sendInlineKeyboard(chatId: ChatId, bot: Bot) {
    val subscribeButton = InlineKeyboardButton.Url(
        text = "🔗 Подписаться на группу",
        url = "https://t.me/+_rSsi7FUDtYyM2Uy"
    )
    val checkSubscriptionButton = InlineKeyboardButton.CallbackData(
        text = "✅ Проверить подписку",
        callbackData = "check_subscription"
    )

    val inlineKeyboardMarkup = InlineKeyboardMarkup.create(
        listOf(subscribeButton),
        listOf(checkSubscriptionButton)
    )

    bot.sendMessage(
        chatId,
        text = """
            🔞 Чтобы продолжить, необходимо подписаться на нашу группу! 
            👉 Нажмите на кнопку ниже, и вас сразу перекинет в группу.
            После подписки нажмите "Проверить подписку".
            Спасибо за понимание!
        """.trimIndent(),
        replyMarkup = inlineKeyboardMarkup
    )
}

