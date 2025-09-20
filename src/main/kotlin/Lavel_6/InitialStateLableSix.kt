package Lavel_6

import BotState
import com.example.Strings
import com.example.Strings.busSexStory
import com.example.Strings.danGreat
import com.example.Strings.danSilent
import com.example.Strings.emilyCalm
import com.example.Strings.emilyConcernForHim
import com.example.Strings.emilyEvening
import com.example.Strings.emilyHonor
import com.example.Strings.emilyHope
import com.example.Strings.emilyLittleTease
import com.example.Strings.emilyPhotoResponse1
import com.example.Strings.emilySimilarities
import com.example.Strings.emilySupportFeel
import com.example.Strings.emilyUnderstood
import com.example.Strings.growingAffection
import com.example.Strings.keepingSecrets
import com.example.Strings.maxDemandMoney
import com.example.Strings.maxRecognize
import com.example.Strings.maxVisit
import com.example.Strings.maxWink
import com.example.Strings.overheardConversation
import com.example.Strings.photonDiscussion
import com.example.Strings.photonNoWorry
import com.example.Strings.photonPlayful
import com.example.Strings.photonRelax
import com.example.Strings.photonTeased
import com.example.Strings.secondGuy4
import com.example.Strings.taxiGoodbye
import com.example.Strings.unchangedFriendship
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class InitialStateLableSix : BotState {
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
                danGreat,
                growingAffection,
                keepingSecrets,
                busSexStory,
                secondGuy4,
                maxVisit,
                unchangedFriendship,
                maxRecognize,
                overheardConversation,
                maxDemandMoney,
                maxWink,
                danSilent,
                taxiGoodbye,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyConcerned)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.wroteFromHome,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableEmilyConcerned : BotState {
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


        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyMemory1)),
                listOf(KeyboardButton(Strings.emilyMemory2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.photonReassurance,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableEmilyEmilyMemory1 : BotState {
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
                photonNoWorry,
                emilyConcernForHim,

            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyAskDiscussion)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.photonReassuring,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableemilyAskDiscussion : BotState {
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
                photonDiscussion,
                emilyUnderstood,
                photonRelax,
                emilyCalm

                ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyPhotoResponse2)),
                listOf(KeyboardButton(emilyPhotoResponse1)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.photonPhotoRequest,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableemilyPhotoResponse1 : BotState {
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

        if (text == emilyPhotoResponse1){
            sendPhotoWithTyping(
                chatId,
                "https://cloud.mail.ru/public/Ueht/dGs4hdUqf",
                "",
                bot
            )
        }
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonTeased,
                emilyLittleTease,
                photonPlayful,
                emilySimilarities,
                emilyEvening,
                emilySupportFeel,
                emilyHonor,
                emilyHope

            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.Lavel_7_Start)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.Lavel_6_Final,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}