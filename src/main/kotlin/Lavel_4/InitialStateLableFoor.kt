package Lavel_4

import BotState
import com.example.Strings
import com.example.Strings.beginningOfSomethingNew
import com.example.Strings.cumSpread
import com.example.Strings.danIntroduction
import com.example.Strings.danNickname
import com.example.Strings.dinnerAndRoom
import com.example.Strings.ejaculation
import com.example.Strings.emilyArrival
import com.example.Strings.exhaustedFromSex
import com.example.Strings.forcefulMove
import com.example.Strings.hotelExpectation
import com.example.Strings.intimacyStart
import com.example.Strings.intimateAction
import com.example.Strings.intimateEntry
import com.example.Strings.lickingAction
import com.example.Strings.nearingOrgasm
import com.example.Strings.noClothes
import com.example.Strings.noResistance1
import com.example.Strings.onTheCouch
import com.example.Strings.orgasmWave
import com.example.Strings.passionateMovement
import com.example.Strings.photonGlad
import com.example.Strings.photonSerious
import com.example.Strings.photonWaiting
import com.example.Strings.playingWithTongue
import com.example.Strings.preludeToPassion
import com.example.Strings.restaurantAtmosphere
import com.example.Strings.roomStyle
import com.example.Strings.roomView
import com.example.Strings.sexyResponseStoryLavelTwoOne4
import com.example.Strings.squeezingButtocks
import com.example.Strings.sweatyBody
import com.example.Strings.takingInitiative
import com.example.Strings.takingInitiative5
import com.example.Strings.taxiRide
import com.example.Strings.timeSinceMeeting
import com.example.Strings.turningPosition
import com.example.Strings.understandingDesire
import com.example.Strings.undressing
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class InitialStateLableFoor : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                sexyResponseStoryLavelTwoOne4,
                Strings.preparingForMeeting,
                Strings.potentialRightPerson,
                Strings.photonGreeting4,
                Strings.emilyResponse5,
            ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/PxG6/KpFeCxsah",
            "",
            bot
        )

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.photonComplimen5,
                Strings.emilyThanks,
                Strings.photonRestaurant,
                Strings.emilyAskRestaurant,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyExpensive)),
                listOf(KeyboardButton(Strings.emilyWhyThere))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.photonRestaurantLocation,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableFooremilyExpensive : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.photonLivingThere,
                Strings.emilyTaste,
                Strings.photonTaxi,
                Strings.emilyNoAddress,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyJokes)),
                listOf(KeyboardButton(Strings.emilyCompliments))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.photonComplimentToTaxi,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}


class InitialStateLableFooreemilyCompliments : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        val a = if(text.contains(Regex(Strings.emilyJokes))){
            photonSerious
        } else{
            photonGlad
        }
        sendMessagesWithTypingList(
            chatId,
            listOf(
                a,
                emilyArrival,
                photonWaiting,
                taxiRide,
                restaurantAtmosphere,
            ),
            bot
        )

        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/xBxx/vHrapECXc",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                danIntroduction,
                danNickname,
                timeSinceMeeting
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.goTohome)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.needToCheckDan,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableFoogoTohome : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                dinnerAndRoom,
                roomView,
                roomStyle,
                hotelExpectation,
                intimacyStart,
                undressing,
                noClothes,

            ),
            bot
        )

        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/EX6H/khxNUzEZQ",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                onTheCouch,
                intimateAction,
                preludeToPassion,
                takingInitiative
            ),
            bot
        )

        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/j2kp/BNm5iAqwz",
            "",
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.goToTheXex)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.pleasureSound,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableFoogogoToTheXex : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                lickingAction,
                forcefulMove,
                intimateEntry,
                ),
            bot
        )

        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/YHtP/1VR68JFJk",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                passionateMovement,
                noResistance1,
                turningPosition,
            ),
            bot
        )

        sendMessagesWithTypingList(
            chatId,
            listOf(
                squeezingButtocks,
                sweatyBody,
            ),
            bot
        )

        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/X3z8/BL8hnDWNZ",
            "",
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.nearingOrgasmGo)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.sweatyBodyA,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class InitialStateLableFoonearingOrgasmGo : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                nearingOrgasm,
                orgasmWave,
                takingInitiative5,
            ),
            bot
        )

        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/u9Ta/FtPj2PY9o",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                playingWithTongue,
                understandingDesire,
                ejaculation,
                cumSpread
            ),
            bot
        )

        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/Je5r/Je1743a8T",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                exhaustedFromSex,
                beginningOfSomethingNew,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.Lavel_5_Start)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.Lavel_4_Final,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}