package Lable_8

import BotState
import com.example.Strings
import com.example.Strings.Lavel_8_Final
import com.example.Strings.Lavel_9_Start
import com.example.Strings.danNo
import com.example.Strings.danPast
import com.example.Strings.danSecrets
import com.example.Strings.danThink
import com.example.Strings.danUnderstand
import com.example.Strings.emilyAccessible1
import com.example.Strings.emilyAgree32
import com.example.Strings.emilyAnger1
import com.example.Strings.emilyAnger2
import com.example.Strings.emilyBeer
import com.example.Strings.emilyBlock1
import com.example.Strings.emilyBlock2
import com.example.Strings.emilyBlock3
import com.example.Strings.emilyCurse1
import com.example.Strings.emilyCurse2
import com.example.Strings.emilyRealization1
import com.example.Strings.emilyRealization2
import com.example.Strings.emilyRealization3
import com.example.Strings.emilyRealization4
import com.example.Strings.emilyReason1
import com.example.Strings.emilyReason2
import com.example.Strings.emilyRecognition1
import com.example.Strings.emilyRecognition2
import com.example.Strings.emilyRecognition3
import com.example.Strings.emilyRefusal1
import com.example.Strings.emilyRefusal2
import com.example.Strings.emilyRefusal3
import com.example.Strings.emilyRefusal4
import com.example.Strings.emilyRefusal5
import com.example.Strings.emilyRetort1
import com.example.Strings.emilyRetort2
import com.example.Strings.emilyScandal1
import com.example.Strings.emilySecrets32
import com.example.Strings.emilyShame
import com.example.Strings.emilyShock
import com.example.Strings.emilySpeechless
import com.example.Strings.emptyGlass
import com.example.Strings.girlInterview1
import com.example.Strings.girlInterview2
import com.example.Strings.girlInterview3
import com.example.Strings.girlInterview4

import com.example.Strings.phoneVibration1
import com.example.Strings.phoneVibration2
import com.example.Strings.yobyrCalm
import com.example.Strings.yobyrGossip
import com.example.Strings.yobyrHello
import com.example.Strings.yobyrIdentity
import com.example.Strings.yobyrTaunt1
import com.example.Strings.yobyrTaunt2
import com.example.Strings.yobyrTaunt3
import com.example.Strings.yobyrTaunt4
import com.example.Strings.yobyrTaunt5
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendMessageWithTyping10
import utils.sendMessagesWithTypingList

class Lavel8Start : BotState {
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
                Strings.chapter8Title,
                emilyRealization1,
                emilyRealization2,
                emilyRealization3,
                emilyRealization4,
                emilyScandal1,
                girlInterview1,
                girlInterview2,
                girlInterview3,
                girlInterview4,
                emilyRecognition1,
                emilyRecognition2,
                emilyRecognition3,
                emilyRefusal1,
                emilyRefusal2,
                emilyRefusal3,
                emilyRefusal4,
                emilyRefusal5,
                phoneVibration1,
                phoneVibration2
            ),
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                phoneVibration1,
                phoneVibration2
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Strings.emilyReply1)),
                listOf(KeyboardButton(Strings.emilyReply2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Strings.danHello,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class emilyReply1Start : BotState {
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
                danUnderstand,
                emilyReason1,
                emilyReason2,
                danPast,
                emilySecrets32,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyShame)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = danSecrets,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}


class emilyShameStart : BotState {
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
                danNo,
                emilySpeechless,
                danThink,
                emilyAgree32,
                emilyBeer,
            ),
            bot
        )
        sendMessageWithTyping10(
            chatId = chatId,
            text = emptyGlass,
            bot = bot,
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyRetort1)),
                listOf(KeyboardButton(emilyRetort2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = yobyrHello,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class emilyRetort2Start : BotState {
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
                yobyrCalm,
                emilyAccessible1,
                yobyrGossip,
                emilyShock,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(emilyAnger1)),
                listOf(KeyboardButton(emilyAnger2)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = yobyrIdentity,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}

class emilyAngerStart : BotState {
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
                yobyrTaunt1,
                yobyrTaunt2,
                yobyrTaunt3,
                yobyrTaunt4,
                yobyrTaunt5,
                emilyCurse1,
                emilyCurse2,
                emilyBlock1,
                emilyBlock2,
                emilyBlock3,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(KeyboardButton(Lavel_9_Start)),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )

        sendMessageWithTyping(
            chatId = chatId,
            text = Lavel_8_Final,
            bot = bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(),false)
    }
}