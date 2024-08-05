package Label_10

import BotState
import com.example.Strings
import com.example.Strings.Glave_1
import com.example.Strings.Glave_2
import com.example.Strings.Glave_3
import com.example.Strings.Glave_4
import com.example.Strings.Glave_5
import com.example.Strings.Glave_6
import com.example.Strings.Glave_7
import com.example.Strings.Glave_8
import com.example.Strings.Glave_9
import com.example.Strings.bossReaction
import com.example.Strings.danAnger
import com.example.Strings.danDisappointment
import com.example.Strings.danDisbelief
import com.example.Strings.danEncouragement
import com.example.Strings.danExit
import com.example.Strings.danNews
import com.example.Strings.danOfferHelp
import com.example.Strings.danQuestion2
import com.example.Strings.danSuccess
import com.example.Strings.danSupport
import com.example.Strings.emilyBreakup1
import com.example.Strings.emilyConclusion
import com.example.Strings.emilyCondition
import com.example.Strings.emilyConfession1
import com.example.Strings.emilyConfession2
import com.example.Strings.emilyCuriosity2
import com.example.Strings.emilyDescent
import com.example.Strings.emilyDescription
import com.example.Strings.emilyDoubt
import com.example.Strings.emilyEmancipation
import com.example.Strings.emilyForum
import com.example.Strings.emilyIndulgence
import com.example.Strings.emilyNotAlone
import com.example.Strings.emilyRealization
import com.example.Strings.emilyRejection1
import com.example.Strings.emilyRejection2
import com.example.Strings.emilyReply23
import com.example.Strings.emilyRoutine
import com.example.Strings.emilySelfDoubt
import com.example.Strings.emilyTease33
import com.example.Strings.finalOne
import com.example.Strings.finalOne123
import com.example.Strings.joeAgreement
import com.example.Strings.joeGreeting
import com.example.Strings.joeProposal
import com.example.Strings.joeReason
import com.example.Strings.yearsPassed
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import utils.sendMessageWithTyping
import utils.sendMessageWithTyping10
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class Lavel10StartOne : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null


        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.chapter10Title,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyBreakup1)),
                listOf(KeyboardButton(Strings.emilyIndecision2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.danBreakup1,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel10StartemilyBreakup1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        val a = if (text == emilyBreakup1){
            danDisappointment
        } else {
            danEncouragement
        }

        sendMessagesWithTypingList(
            chatId,
            listOf(
                a,
                emilyDoubt,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyConfession1)),
                listOf(KeyboardButton(emilyConfession2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = danQuestion2,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel10emilyConfession1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        val a = if (text == emilyConfession1){
            danDisbelief
        } else {
            danOfferHelp
        }

        sendMessagesWithTypingList(
            chatId,
            listOf(
                a,
                emilySelfDoubt
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyRejection1)),
                listOf(KeyboardButton(emilyRejection2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = danSupport,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class Lavel10emilyRejection1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                danAnger,
                danExit,
                emilyRealization,
                emilyIndulgence,
            ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/8Kfw/UeCYMeczV",
            "",
            bot
        )
        sendMessageWithTyping10(
            chatId = chatId,
            text = yearsPassed,
            bot = bot,

        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                emilyDescent,
                emilyEmancipation,
                bossReaction,
                emilyRoutine,
                emilyDescription,
                emilyNotAlone,
                danNews,
                danSuccess,
                emilyCuriosity2,
                emilyForum,
                joeGreeting,
                emilyReply23,
                joeProposal,
                emilyCondition,
                joeAgreement,
                emilyTease33,
                joeReason,
                emilyConclusion,
                finalOne,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Glave_1), KeyboardButton(Glave_2)),
                listOf(KeyboardButton(Glave_3), KeyboardButton(Glave_4)),
                listOf(KeyboardButton(Glave_5),KeyboardButton(Glave_6)),
                listOf(KeyboardButton(Glave_7), KeyboardButton(Glave_8)),
                listOf(KeyboardButton(Glave_9)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = finalOne123,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}