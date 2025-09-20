package Label_9

import BotState
import com.example.Strings
import com.example.Strings.Lavel_10_Start
import com.example.Strings.Lavel_10_Start_two
import com.example.Strings.Lavel_9_Final
import com.example.Strings.danAcceptance
import com.example.Strings.danChoice1
import com.example.Strings.danChoice2
import com.example.Strings.danClarification
import com.example.Strings.danHumor
import com.example.Strings.danQuestion1s
import com.example.Strings.denmsg
import com.example.Strings.emilyBadMood
import com.example.Strings.emilyBored
import com.example.Strings.emilyChoice1
import com.example.Strings.emilyChoice2
import com.example.Strings.emilyConfessions
import com.example.Strings.emilyCuriosity34
import com.example.Strings.emilyDecision
import com.example.Strings.emilyDesires
import com.example.Strings.emilyDisconnect
import com.example.Strings.emilyDismiss
import com.example.Strings.emilyDoubt1
import com.example.Strings.emilyDoubt2
import com.example.Strings.emilyFantasy1
import com.example.Strings.emilyFantasy2
import com.example.Strings.emilyFantasy3
import com.example.Strings.emilyFantasy4
import com.example.Strings.emilyGuilt
import com.example.Strings.emilyIndecision
import com.example.Strings.emilyQuestion1
import com.example.Strings.emilyReality
import com.example.Strings.emilyRealityCheck
import com.example.Strings.emilyReflection1
import com.example.Strings.emilyReflection2
import com.example.Strings.emilyWonder
import com.example.Strings.samXXLFantasy1
import com.example.Strings.samXXLFantasy2
import com.example.Strings.samXXLFantasy3
import com.example.Strings.samXXLFantasy4
import com.example.Strings.samXXLHowAreYou
import com.example.Strings.samXXLShock
import com.example.Strings.samXXLWhy
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList

class Lavel9Start : BotState {
    override suspend fun handleText(
        chatId: ChatId,
        text: String,
        userId: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.chapter9Title,
                Strings.emilyStress1,
                Strings.emilyStress2,
                Strings.emilyStress3,
                Strings.emilyStress4,
                Strings.emilyMessage,
                Strings.emilyComment333,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyHello)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.samXXLHello,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel9StartemilyHello : BotState {
    override suspend fun handleText(
        chatId: ChatId,
        text: String,
        userId: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                samXXLHowAreYou,
                emilyBadMood,
                samXXLWhy,
                emilyBored,

            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyChallenge1)),
                listOf(KeyboardButton(Strings.emilyChallenge2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.samXXLFlirt1,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel9StaremilyChallenge2 : BotState {
    override suspend fun handleText(
        chatId: ChatId,
        text: String,
        userId: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null


        sendMessagesWithTypingList(
            chatId,
            listOf(
                samXXLFantasy1,
                emilyFantasy1,
                samXXLFantasy2,
                emilyFantasy2,
                samXXLFantasy3,
                emilyFantasy3,
                samXXLFantasy4,
                emilyFantasy4,
                ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyAngerFantasy1)),
                listOf(KeyboardButton(Strings.emilyAngerFantasy2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.samXXLFantasy5,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel9StaremilyAngerFantasy1 : BotState {
    override suspend fun handleText(
        chatId: ChatId,
        text: String,
        userId: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                samXXLShock,
                emilyDismiss,
                emilyDisconnect,
                emilyDoubt1,
                emilyDoubt2,
                emilyReflection1,
                emilyReflection2,
                emilyGuilt,
                emilyWonder,
                emilyCuriosity34,
                denmsg
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyReply43)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.danMessage,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel9StaremilyReply43 : BotState {
    override suspend fun handleText(
        chatId: ChatId,
        text: String,
        userId: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                danClarification,
                emilyReality,
                danAcceptance,
                emilyQuestion1,
                danQuestion1s,
                emilyConfessions,
                danHumor,
                emilyIndecision,
                danChoice1,
                emilyRealityCheck,
                danChoice2,
                emilyDesires,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyChoice1)),
                listOf(KeyboardButton(emilyChoice2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.danFinalChoice,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel9StaremiemilyDesires : BotState {
    override suspend fun handleText(
        chatId: ChatId,
        text: String,
        userId: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(emilyDecision),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Lavel_10_Start)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Lavel_9_Final,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel9StaremiemilyDesires2 : BotState {
    override suspend fun handleText(
        chatId: ChatId,
        text: String,
        userId: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                emilyDecision,
                ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Lavel_10_Start_two)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Lavel_9_Final,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}