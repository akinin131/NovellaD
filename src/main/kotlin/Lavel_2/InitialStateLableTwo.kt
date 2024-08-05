package Lavel_2

import BotState
import com.example.Strings
import com.example.Strings.Emilywenttobed
import com.example.Strings.Lavel_2_Final
import com.example.Strings.Lavel_3_Start
import com.example.Strings.almostEndOfWorkDay
import com.example.Strings.batteryLow1
import com.example.Strings.batteryLow2
import com.example.Strings.clearingMind
import com.example.Strings.cozyRoomDescription
import com.example.Strings.decidedToFollow
import com.example.Strings.dialogueStart
import com.example.Strings.doorOpening
import com.example.Strings.emilyAcceptance
import com.example.Strings.emilyAgree
import com.example.Strings.emilyAgreeTwo
import com.example.Strings.emilyComment
import com.example.Strings.emilyDay
import com.example.Strings.emilyDefend
import com.example.Strings.emilyDepartureMessage
import com.example.Strings.emilyDesire
import com.example.Strings.emilyEncouragement
import com.example.Strings.emilyExclamation
import com.example.Strings.emilyFlirty
import com.example.Strings.emilyGentleman1
import com.example.Strings.emilyGentleman2
import com.example.Strings.emilyGreeting
import com.example.Strings.emilyJoke1
import com.example.Strings.emilyLaugh
import com.example.Strings.emilyNoOpportunity
import com.example.Strings.emilyNoSex
import com.example.Strings.emilyPhoneDead
import com.example.Strings.emilyPhoto
import com.example.Strings.emilyPleasure
import com.example.Strings.emilyQuestion
import com.example.Strings.emilyReply
import com.example.Strings.emilyRequest
import com.example.Strings.emilyRequest1
import com.example.Strings.emilyRequest2
import com.example.Strings.emilyResponse
import com.example.Strings.emilyResponse1
import com.example.Strings.emilyResponse2
import com.example.Strings.emilySuggest
import com.example.Strings.emilySuggest_1
import com.example.Strings.emilySuggest_2
import com.example.Strings.emilySweetDreams
import com.example.Strings.emilyTomorrow
import com.example.Strings.emilyUnderwearSuggestion
import com.example.Strings.emilyWorkAffair
import com.example.Strings.feltLikeParticipant
import com.example.Strings.go
import com.example.Strings.goContiniue
import com.example.Strings.goToBack
import com.example.Strings.harrisBreathing
import com.example.Strings.harrisHands
import com.example.Strings.harrisLicking
import com.example.Strings.headingToHarris
import com.example.Strings.hi
import com.example.Strings.hidingBehindCloset
import com.example.Strings.intro
import com.example.Strings.liftingLinda
import com.example.Strings.lindaAndHarrisKissing
import com.example.Strings.lindaEnteringHarrisOffice
import com.example.Strings.lindaGoingDown
import com.example.Strings.lindaOral
import com.example.Strings.lindaSneaking
import com.example.Strings.morningDialogueStart
import com.example.Strings.noticedLindaDisappearing
import com.example.Strings.photonArousal
import com.example.Strings.photonBedScenario
import com.example.Strings.photonBoringDialogue
import com.example.Strings.photonChoking
import com.example.Strings.photonComment
import com.example.Strings.photonCompliment
import com.example.Strings.photonCompliment3
import com.example.Strings.photonComplimentTwo
import com.example.Strings.photonDesire
import com.example.Strings.photonDesireToRemove
import com.example.Strings.photonEntry
import com.example.Strings.photonFollowUp1
import com.example.Strings.photonFollowUp2
import com.example.Strings.photonForeplay
import com.example.Strings.photonGoodnight
import com.example.Strings.photonGoodnightTwo
import com.example.Strings.photonGreeting
import com.example.Strings.photonJoke1
import com.example.Strings.photonMagic
import com.example.Strings.photonMessageWaiting
import com.example.Strings.photonPenetration
import com.example.Strings.photonQuestion
import com.example.Strings.photonQuestion1
import com.example.Strings.photonQuestion2
import com.example.Strings.photonSecret1
import com.example.Strings.photonSecret2
import com.example.Strings.photonSmallSteps
import com.example.Strings.photonSuggestTomorrow
import com.example.Strings.photonTease1
import com.example.Strings.photonTired
import com.example.Strings.photonUnderstanding
import com.example.Strings.photonWorkInquiry
import com.example.Strings.sendMessagePhoton
import com.example.Strings.sheWasRight
import com.example.Strings.strugglingToJoin
import com.example.Strings.tenMinutesLater
import com.example.Strings.unnoticedExit
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class SexyResponseLableTwo_One : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {

        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        val listOf = (listOf<String>(Strings.sexyResponseStoryLavelTwoOne1, Strings.sexyResponseStoryLavelTwoOne2, ))
        sendMessagesWithTypingList(
            chatId,
            listOf,
            bot,
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(emilyResponse1),
                ),
                listOf(
                    KeyboardButton(emilyResponse2),
                ),

            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            dialogueStart,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_photonFollowUp1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(emilyAgree),
                )
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            photonFollowUp1,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_photonFollowUp2 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(emilyAgree),
                )
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            photonFollowUp2,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_photonQuestion : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(photonQuestion,emilyDay,photonTease1,emilyComment),
            bot,
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyRequest1)),
                listOf(KeyboardButton(emilyRequest2))
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonMagic,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyRequest1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {

        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(photonSecret1,emilyLaugh,photonCompliment,emilySuggest,emilySuggest_1,emilySuggest_2,photonGoodnight,Emilywenttobed,morningDialogueStart),
            bot,
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyDefend)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonJoke1,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyRequest2 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(photonSecret2,emilyLaugh,photonCompliment,emilySuggest,emilySuggest_1,emilySuggest_2,photonGoodnight,Emilywenttobed,morningDialogueStart,),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyDefend)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonJoke1,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyDefend : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyJoke1)),
                listOf(KeyboardButton(emilyPhoto)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonComplimentTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyPhoto : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/AdBE/cfbtW3zpT",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(photonQuestion2,emilyResponse,photonComment,emilyReply,emilyDepartureMessage, intro),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(go)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            noticedLindaDisappearing,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyJoke1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(photonQuestion1
                ,emilyResponse,photonComment,emilyReply, emilyDepartureMessage, intro),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(go)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            noticedLindaDisappearing,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_go : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                decidedToFollow,lindaSneaking, sheWasRight, headingToHarris,lindaEnteringHarrisOffice,cozyRoomDescription,),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(goContiniue)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            hidingBehindCloset,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_goContiniue : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                doorOpening,lindaAndHarrisKissing,harrisHands,feltLikeParticipant,lindaGoingDown,lindaOral),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/pKWr/M2xRXLZXU",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                harrisBreathing,liftingLinda),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/hRLy/ZMYzDu64X",
            "",
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(goToBack)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            harrisLicking,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_goToBack : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                strugglingToJoin,unnoticedExit, tenMinutesLater,clearingMind,almostEndOfWorkDay,sendMessagePhoton),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyGreeting)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonGreeting,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyGreeting : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                strugglingToJoin,unnoticedExit, tenMinutesLater,clearingMind,almostEndOfWorkDay,sendMessagePhoton),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyGentleman1)),
                listOf(KeyboardButton(emilyGentleman2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonMessageWaiting,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyGentleman1_or_emilyGentleman2 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonWorkInquiry,emilyWorkAffair, photonChoking,emilyNoSex,photonUnderstanding,emilyNoOpportunity),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyFlirty)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonDesire,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyFlirty : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonSmallSteps, emilyUnderwearSuggestion),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/WMxM/LpvKbFK4Y",
            "",
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyQuestion)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonCompliment3,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyQuestion : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonDesireToRemove, emilyEncouragement,),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyAcceptance)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonBedScenario,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyAcceptance : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonForeplay, emilyDesire,),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyExclamation)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonPenetration,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}


class SexyResponseLableTwo_emilyExclamation : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonArousal, emilyRequest,photonEntry,emilyPleasure,batteryLow1,batteryLow2,hi),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyPhoneDead)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            photonBoringDialogue,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class SexyResponseLableTwo_emilyPhoneDead : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(),true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                photonSuggestTomorrow, emilyAgreeTwo,photonTired,emilyTomorrow,photonGoodnightTwo,emilySweetDreams),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Lavel_3_Start)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId,
            Lavel_2_Final,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}