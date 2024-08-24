package Lavel_1

import BotState
import BotStateFactory
import com.example.Strings
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.*
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendPhotoWithTyping

class InitialStateLableOneT : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {}}

class InitialStateLableOne : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessageWithTyping(
            chatId,
            Strings.introMessage1,
            bot,
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage2,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage3,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage4,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage5,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage6,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage7,
            bot
        )

        sendMessageWithTyping(
            chatId,
            Strings.introMessage8,
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.choiceMessage1))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.choiceMessage2,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseState : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseIntro1,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseIntro2,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory1,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory2,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory2_1,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory3,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory3_1,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory4,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory4_1,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory5,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory5_1,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory6,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory7,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory7_1,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory8,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory9,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory9_1,
            bot
        )
        val choiceOfAvatar1 = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.sexyResponseStory10_1))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory10,
            bot,
            choiceOfAvatar1
        )

        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseState_one : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory11,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory12,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory13,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory15,
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/qPQf/17g1LshU1",
            "",
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.sexyResponseStory16_1))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory16,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseState_two : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory17,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory18,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory19,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStory19_1,
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/ydG1/qcVuexmAd",
            "",
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryTwo20,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryTwo21,
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/cRFz/hCckDAnPf",
            "",
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryTwo22,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryTwo23,
            bot,

        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryTwo24,
            bot,
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.sexyResponseStoryTwo26))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryTwo25,
            bot,
            choiceOfAvatar
            )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseState_final : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryTwo27,
            bot
        )

        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryTwo28,
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.sexyResponseStoryThree1))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryTwo29,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseState_foor : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryThree2,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryThree3,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour1,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour2,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour3,
            bot
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour4,
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.sexyResponseStoryFour6))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour5,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}
class SexyResponseState_five : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.sexyResponseStoryFour8))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour7,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseState_six : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour9,
            bot,
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour10,
            bot,
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour10_1,
            bot,
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour10_2,
            bot,
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour10_3,
            bot,
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour10_4,
            bot,
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.sexyResponseStoryFour12))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour10_5,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}
 class SexyResponseState_seven : BotState {

    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour13,
            bot,
        )
        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour14,
            bot,
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.sexyResponseStoryFour16))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            Strings.sexyResponseStoryFour15,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}