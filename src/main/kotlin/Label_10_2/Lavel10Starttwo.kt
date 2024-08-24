package Label_10_2

import BotState
import com.example.Strings
import com.example.Strings.afterglow
import com.example.Strings.bestSex
import com.example.Strings.bossAnger
import com.example.Strings.bossResponse
import com.example.Strings.busyJob
import com.example.Strings.danArrival
import com.example.Strings.danBreastKiss
import com.example.Strings.danClimax
import com.example.Strings.danDescending
import com.example.Strings.danDoubt
import com.example.Strings.danEndurance
import com.example.Strings.danExplanation
import com.example.Strings.danInterruption
import com.example.Strings.danKisses
import com.example.Strings.danLobes
import com.example.Strings.danLowerKiss
import com.example.Strings.danPassion
import com.example.Strings.danPenetration
import com.example.Strings.danResponse
import com.example.Strings.danSurprise
import com.example.Strings.emilyAroused
import com.example.Strings.emilyClimax
import com.example.Strings.emilyClimax111
import com.example.Strings.emilyConcern
import com.example.Strings.emilyConclusion111
import com.example.Strings.emilyConclusion1112
import com.example.Strings.emilyConfusion
import com.example.Strings.emilyDefiance
import com.example.Strings.emilyDeleteBoss
import com.example.Strings.emilyDesire244
import com.example.Strings.emilyDesiree
import com.example.Strings.emilyEcstasy
import com.example.Strings.emilyFinal
import com.example.Strings.emilyInvitation
import com.example.Strings.emilyOral
import com.example.Strings.emilyOrgasm
import com.example.Strings.emilyQuit
import com.example.Strings.emilyResignation
import com.example.Strings.emilyStress
import com.example.Strings.emilySwallow
import com.example.Strings.emilyTongue
import com.example.Strings.emilyUncertainty
import com.example.Strings.emilyUndressed
import com.example.Strings.flowerShop
import com.example.Strings.futurePlans
import com.example.Strings.marriage
import com.example.Strings.mutualAcceptance
import com.example.Strings.mutualFeelings
import com.example.Strings.newJob
import com.example.Strings.realLove
import com.example.Strings.writeboss
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class Lavel10Starttwo : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.chapter10Together,
                emilyDesiree,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyQuestionn)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.danReassurance,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel10StartemilyQuestionn : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                danDoubt,
                emilyConcern,
                danInterruption,
                ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyConfusion)),

                ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.danApology,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel10StaremilyConfusion : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null


        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyUncertainty)),

                ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.danRealization,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel10emilyUncertainty : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                danExplanation,
                emilyStress,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyInvitation)),

                ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.danEncouragement44,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel10emilyInvitation : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                danSurprise,
                emilyDesire244,
                danResponse,
                danArrival,
                emilyUndressed,
                danKisses,
                danDescending,
                danBreastKiss,
                emilyAroused,
                danLowerKiss,
                danLobes,
                emilyEcstasy,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyClimax111)),

                ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = emilyClimax,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel10emilyClimax111 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                danPenetration,
                danPassion,
                emilyOrgasm,
                danEndurance,
                emilyOral,
                emilyTongue,
                danClimax,
                emilySwallow,
            ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/cgLM/Zemf5N9L6",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                afterglow,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(writeboss)),

                ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = bestSex,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel10writeboss : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                emilyResignation,
                emilyQuit,
                bossResponse,
                emilyDefiance,
                bossAnger,
                emilyFinal,
                emilyDeleteBoss,
                marriage,
                mutualAcceptance,
                realLove,
                newJob,
                flowerShop,
                futurePlans,
                busyJob,
                mutualFeelings,
                emilyConclusion111,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.Glave_1), KeyboardButton(Strings.Glave_2)),
                listOf(KeyboardButton(Strings.Glave_3), KeyboardButton(Strings.Glave_4)),
                listOf(KeyboardButton(Strings.Glave_5),KeyboardButton(Strings.Glave_6)),
                listOf(KeyboardButton(Strings.Glave_7), KeyboardButton(Strings.Glave_8)),
                listOf(KeyboardButton(Strings.Glave_9)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = emilyConclusion1112,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}
