import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.types.TelegramBotResult

interface BotState {
    suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>)
}
