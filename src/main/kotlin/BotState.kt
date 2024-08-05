import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId

interface BotState {
    suspend fun handleText(chatId: ChatId, text: String, bot: Bot)
}
