package Lavel_3

import BotState
import com.example.Strings.Lavel_3_Final
import com.example.Strings.Lavel_4_Start
import com.example.Strings.anticipation
import com.example.Strings.arousal
import com.example.Strings.backGuyFinish
import com.example.Strings.backgroundSound
import com.example.Strings.boysSmile
import com.example.Strings.chatIntro
import com.example.Strings.continiueStory
import com.example.Strings.continiueStory2
import com.example.Strings.conversationOutcome
import com.example.Strings.description
import com.example.Strings.desire
import com.example.Strings.drippingSemen
import com.example.Strings.emilyAsks
import com.example.Strings.emilyConfession
import com.example.Strings.emilyCuriosity
import com.example.Strings.emilyDesire1
import com.example.Strings.emilyDesire2
import com.example.Strings.emilyGuess
import com.example.Strings.emilyHonesty1
import com.example.Strings.emilyHonesty2
import com.example.Strings.emilyInterest
import com.example.Strings.emilyIntrigued
import com.example.Strings.emilyListen
import com.example.Strings.emilyProposal
import com.example.Strings.emilyRequestDeack
import com.example.Strings.emilyStory
import com.example.Strings.emilyTruth
import com.example.Strings.emilyTurnedOn
import com.example.Strings.emilyWatching
import com.example.Strings.emptyBus
import com.example.Strings.eveningWait
import com.example.Strings.forwardLean
import com.example.Strings.frontGuyFinish
import com.example.Strings.hotWeather
import com.example.Strings.intenseSuck
import com.example.Strings.lastBus
import com.example.Strings.minuteLater
import com.example.Strings.mouthPenetration
import com.example.Strings.mutualAgreement
import com.example.Strings.noResistance
import com.example.Strings.photonAttention
import com.example.Strings.photonEncouragement
import com.example.Strings.photonFoundShow
import com.example.Strings.photonGreeting3
import com.example.Strings.photonImagineNaked
import com.example.Strings.photonJustShowered
import com.example.Strings.photonMagicianReply
import com.example.Strings.photonNaturalReply
import com.example.Strings.photonResponse1
import com.example.Strings.photonSkeletonsCloset
import com.example.Strings.photonStoryIntro
import com.example.Strings.photonTwist
import com.example.Strings.photonWandReady
import com.example.Strings.photonWhatQuestion
import com.example.Strings.readMassege
import com.example.Strings.realization
import com.example.Strings.relaxThought
import com.example.Strings.responseWow
import com.example.Strings.secondGuy
import com.example.Strings.secondGuyActions
import com.example.Strings.sexyResponseStoryLavelTwoOne3
import com.example.Strings.silentJourney
import com.example.Strings.smoothMoves
import com.example.Strings.soundEffect
import com.example.Strings.startEmilyStory
import com.example.Strings.studentLifeIntro
import com.example.Strings.suddenApproach
import com.example.Strings.surpriseFind
import com.example.Strings.tongueMovement
import com.example.Strings.tookInHand
import com.example.Strings.tvSceneDetail
import com.example.Strings.tvSceneStart
import com.example.Strings.unforgettableEpisode
import com.example.Strings.universityEnd
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.Message
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.entities.payments.InvoicePhotoDetail

import com.github.kotlintelegrambot.entities.payments.PaymentInvoiceInfo
import com.github.kotlintelegrambot.entities.payments.*
import isUserSubscribed
import updateSubscriptionStatus
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping
import java.math.BigInteger

class InitialStateLableThree : BotState {

    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        if (!isUserSubscribed(chatId.toString())) {
            handlePayCommand(chatId, bot)
            BotStateFactory.setActive(chatId.toString(),false)
            println("Подписка не оформлена")
            return
        }
        sendMessagesWithTypingList(
            chatId,
            listOf(
                sexyResponseStoryLavelTwoOne3,
                chatIntro,
                eveningWait,
                surpriseFind,
                tvSceneStart,
                tvSceneDetail,
            ),
            bot
        )

        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/x5pt/9RAjUSpxD",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                soundEffect,
                backgroundSound,

            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(readMassege))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = relaxThought,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_readMassege : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonGreeting3,
                emilyWatching,
                photonFoundShow,
                        emilyAsks,
                photonJustShowered,
                emilyIntrigued

            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyTurnedOn))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = photonWhatQuestion,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyTurnedOn : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonImagineNaked,
                emilyGuess,
                photonMagicianReply,
                emilyRequestDeack,
                photonWandReady,
                emilyConfession

            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyTruth))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = photonNaturalReply,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyTruth : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonSkeletonsCloset,
                emilyListen

            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(startEmilyStory))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = photonAttention,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_startEmilyStory : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                emilyStory,
                studentLifeIntro,
                universityEnd,
                lastBus,
                emptyBus,
                hotWeather,
                boysSmile,
                suddenApproach,
                secondGuy,
            ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/uLUh/MbceebMcj",
            "",
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(continiueStory))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = noResistance,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_continiueStory : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                realization,
                minuteLater,
                description,
                tookInHand
            ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/nubv/6uqbUvZcc",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                secondGuyActions,
                arousal,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(continiueStory2))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = desire,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_continiueStory2 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                forwardLean,
                smoothMoves,
                mouthPenetration,
                tongueMovement,
                backGuyFinish,
                intenseSuck,
                frontGuyFinish,
                drippingSemen
            ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/B12S/FUZwkCHQj",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                silentJourney,
                unforgettableEpisode
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyHonesty1)),
                listOf(KeyboardButton(emilyHonesty2))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = responseWow,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyHonesty1_or_emilyHonesty2 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonResponse1,
                emilyDesire1,
                emilyDesire2,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyCuriosity)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text =  photonEncouragement,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyCuriosity : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonStoryIntro,
                emilyInterest,
                photonTwist,
                emilyProposal,
                conversationOutcome,
                mutualAgreement,
                anticipation
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Lavel_4_Start)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId = chatId,
            text =  Lavel_3_Final,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

suspend fun handleSuccessfulPayment(bot: Bot, message: Message, chatId: ChatId) {
    try {
        bot.sendMessage(
            chatId = chatId,
            text = "Оплата прошла успешно! Вам доступна полная версия новеллы"
        )
        updateSubscriptionStatus(chatId.toString(), 10000)
    } catch (e: Exception) {
        println("Error sending thank you message: ${e.message}")
    }
}

private fun handlePayCommand(chatId: ChatId, bot: Bot) {
    val prices = listOf(
        LabeledPrice(
            label = "Новелла \"Под двойной маской\"",
            amount = BigInteger.valueOf(14900)
        )
    )
    val invoiceInfo = PaymentInvoiceInfo(
        title = "Новелла",
        description = "Для дальнейшего прохождения необходимо приобрести новеллу\n\nДанный проект построен только на одном платеже – Проведя один платёж в 149₽ Тебе откроется остальная часть новеллы❗\uFE0F",
        payload = "PayMaster",
        providerToken = "381764678:TEST:90475",  // Token for payment provider
        currency = "rub",
        prices = prices,
        startParameter = "test-invoice-payload",
        isFlexible = false,
        providerData = null,
        invoiceUserDetail = null,
        invoicePhoto = InvoicePhotoDetail(
            photoUrl = "https://photos.xgroovy.com/contents/albums/sources/697000/697879/775654.jpg", // URL of your photo
            photoWidth = 450,
            photoHeight = 600
        )
    )

    try {
        bot.sendInvoice(
            chatId = chatId,
            paymentInvoiceInfo = invoiceInfo,
            disableNotification = null,
            replyToMessageId = null,
            allowSendingWithoutReply = null,
            replyMarkup = null
        )
    } catch (e: Exception) {
        // Handle the error, e.g., log it or notify the user
        println("Error sending invoice: ${e.message}")
    }
}

