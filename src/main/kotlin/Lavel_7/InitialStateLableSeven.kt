package Lavel_7

import BotState
import com.example.Strings
import com.example.Strings.Lavel_7_Final
import com.example.Strings.bossMessage
import com.example.Strings.bossNotReports
import com.example.Strings.bossReveal
import com.example.Strings.bossSpeechExplanation
import com.example.Strings.danBreak
import com.example.Strings.danConfidence1
import com.example.Strings.danExplainLater
import com.example.Strings.danNotSleeping1
import com.example.Strings.danPublicPressure2
import com.example.Strings.danReassuring
import com.example.Strings.danWizard
import com.example.Strings.danWork
import com.example.Strings.danWorkTroubles1
import com.example.Strings.emilyAloneWithClient
import com.example.Strings.emilyAnger
import com.example.Strings.emilyBelief
import com.example.Strings.emilyBigBusinessman
import com.example.Strings.emilyClientAction
import com.example.Strings.emilyClientOrder
import com.example.Strings.emilyContractSigned
import com.example.Strings.emilyDanChanged
import com.example.Strings.emilyDoAnything
import com.example.Strings.emilyFatClient
import com.example.Strings.emilyHorror
import com.example.Strings.emilyIntenseSex
import com.example.Strings.emilyMistake
import com.example.Strings.emilyPainToPleasure
import com.example.Strings.emilyPlayingWithTongue
import com.example.Strings.emilyReports
import com.example.Strings.emilySecrets
import com.example.Strings.emilySelfChanged
import com.example.Strings.emilySkeleton
import com.example.Strings.emilySpeech
import com.example.Strings.emilyStrengthenRelationship
import com.example.Strings.emilyThinking
import com.example.Strings.emilyThoughtsInterrupted
import com.example.Strings.emilyTricks
import com.example.Strings.emilyWorkDifficulties
import com.example.Strings.morningMessage
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class InitialStateLableSeven : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                emilyMistake,
                emilyDanChanged,
                emilySelfChanged,
                emilySkeleton,
                emilyWorkDifficulties,
                emilyTricks,

            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyClientOfficeStr)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.emilyClientOffice,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableSevenemilyClientOfficeStr : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                emilyFatClient,
                emilyBigBusinessman,
                emilyDoAnything,
                emilyAloneWithClient,
                emilyPlayingWithTongue,
                emilyClientOrder,

                ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/p3yH/1LuQh7gi6",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(

                emilyClientAction,
                emilyPainToPleasure,
                emilyIntenseSex,
                emilyContractSigned,
                emilyThoughtsInterrupted
                ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyNoSleep1)),
                listOf(KeyboardButton(Strings.emilyNoSleep2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = danNotSleeping1,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableSevenemilyNoSleep1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
         val txt = if (text== Strings.emilyNoSleep1){
             danWorkTroubles1
         } else {
             danPublicPressure2
         }
        sendMessagesWithTypingList(
            chatId,
            listOf(
                txt,
                emilyHorror,
                ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyWorried1)),
                listOf(KeyboardButton(Strings.emilyHopes)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = danReassuring,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableSevendanConfidence1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                danConfidence1,
                emilyStrengthenRelationship,
                danWizard,
                emilyBelief,
                emilySecrets,
                morningMessage,
                bossMessage,
                emilyReports,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyConcern1)),
                listOf(KeyboardButton(Strings.emilyConcern2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = bossNotReports,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}


class InitialStateLableSevenemilyConcern2 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                bossReveal,
                emilySpeech,
                bossSpeechExplanation,
                emilyThinking,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyShock1)),
                listOf(KeyboardButton(Strings.emilyShock2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = danBreak,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableSevenemilyShock2 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                danWork,
                emilyAnger,
                danExplainLater,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.Lavel_8_Start)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Lavel_7_Final,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}
