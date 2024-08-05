package Label_5

import BotState
import com.example.Strings
import com.example.Strings.Lavel_6_Start
import com.example.Strings.annoyingJob
import com.example.Strings.clothingStore
import com.example.Strings.emilyAdventure
import com.example.Strings.emilyClients
import com.example.Strings.emilyGoodNight
import com.example.Strings.emilyNoDoubt
import com.example.Strings.emilyNotFair
import com.example.Strings.emilyPresident
import com.example.Strings.emilyReport
import com.example.Strings.emilyTease
import com.example.Strings.emilyWorkQuestion
import com.example.Strings.feelingCaredFor
import com.example.Strings.hopefulFuture
import com.example.Strings.missingCare
import com.example.Strings.passionateAct
import com.example.Strings.photonAlmost
import com.example.Strings.photonAnotherGame
import com.example.Strings.photonConfident
import com.example.Strings.photonEncourage
import com.example.Strings.photonLaughing
import com.example.Strings.photonSatisfied
import com.example.Strings.photonSweetDreams
import com.example.Strings.photonTease
import com.example.Strings.preparingReport
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class InitialStateLableFive : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.sexyResponseStoryLavelTwoOne5,
                Strings.gettingCloser,
                Strings.notJustMessages,
                Strings.eachMeeting,
                Strings.publicPlaces,
                clothingStore,
                passionateAct
            ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/ToeK/WZ71AqLhV",
            "",
            bot
        )

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.tryingToStayQuiet,
                Strings.holdingMeQuiet,
                Strings.feelingAfterSex,
                Strings.eveningChat,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyLegs)),
                listOf(KeyboardButton(Strings.emilyReadyToFinish))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.dayReview,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}


class InitialStateLableemilyLegs : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonSatisfied,
                emilyAdventure,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyBossTrouble)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.photonWorkQuestion,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableemilyBossTrouble : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonConfident,
                emilyClients,
                photonTease,
                emilyWorkQuestion,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyPresident)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.photonStable,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableeemilyPresident : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonAlmost,
                emilyNoDoubt,
                photonLaughing,
                emilyTease,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyNotFair)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.photonYouAre,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableemilyNotFair : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonAnotherGame,
                emilyReport,
                photonEncourage,
                emilyGoodNight,
                photonSweetDreams,
                feelingCaredFor,
                missingCare,
                hopefulFuture,
                preparingReport,
                annoyingJob
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Lavel_6_Start)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.Lavel_5_Final,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}