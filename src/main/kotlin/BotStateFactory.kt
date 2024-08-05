import Label_10.Lavel10StartOne
import Label_10.Lavel10StartemilyBreakup1
import Label_10.Lavel10emilyConfession1
import Label_10.Lavel10emilyRejection1
import Label_10_2.*
import Label_5.*
import Label_9.*
import Lable_8.*
import Lavel_1.*
import Lavel_2.*
import Lavel_3.*
import Lavel_4.*
import Lavel_6.*
import Lavel_7.*
import com.example.Strings
import com.example.Strings.Lavel_7_Start
import com.example.Strings.Lavel_8_Start
import com.example.Strings.emilyAcceptance
import com.example.Strings.emilyAskDiscussion
import com.example.Strings.emilyClientOfficeStr
import com.example.Strings.emilyConcern1
import com.example.Strings.emilyConcern2
import com.example.Strings.emilyConcerned
import com.example.Strings.emilyCuriosity
import com.example.Strings.emilyDefend
import com.example.Strings.emilyGentleman1
import com.example.Strings.emilyGentleman2
import com.example.Strings.emilyHonesty1
import com.example.Strings.emilyHopes
import com.example.Strings.emilyJoke1
import com.example.Strings.emilyLegs
import com.example.Strings.emilyMemory1
import com.example.Strings.emilyMemory2
import com.example.Strings.emilyNoSleep1
import com.example.Strings.emilyNoSleep2
import com.example.Strings.emilyPhoto
import com.example.Strings.emilyPhotoResponse1
import com.example.Strings.emilyPhotoResponse2
import com.example.Strings.emilyPresident
import com.example.Strings.emilyQuestion
import com.example.Strings.emilyReply1
import com.example.Strings.emilyReply2
import com.example.Strings.emilyRequest1
import com.example.Strings.emilyRequest2
import com.example.Strings.emilyResponse1
import com.example.Strings.emilyResponse2
import com.example.Strings.emilyShame
import com.example.Strings.emilyShock1
import com.example.Strings.emilyShock2
import com.example.Strings.emilyTruth
import com.example.Strings.emilyWhyThere
import com.example.Strings.emilyWorried1
import com.example.Strings.intro
import com.example.Strings.photonWorkInquiry
import com.example.Strings.sexyResponseStory16_1
import com.example.Strings.sexyResponseStoryFour16
import com.example.Strings.sexyResponseStoryFour6
import com.example.Strings.sexyResponseStoryTwo26
import com.github.kotlintelegrambot.entities.ChatId
import kotlinx.coroutines.Job
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.concurrent.ConcurrentHashMap

object BotStateFactory {
    private val mutex = Mutex()
    internal var executingTexts: ConcurrentHashMap<String, Boolean>? = ConcurrentHashMap()

    private var _isActive = false
    private val activeStates = ConcurrentHashMap<String, Boolean>()
    internal val executingTextsPhoto = ConcurrentHashMap<String, Boolean>()
    private val executingJobs = ConcurrentHashMap<String, Job>()
    private val executingJobsPhoto = ConcurrentHashMap<String, Job>()

    // Геттер для активности конкретного chatId
    fun isActive(chatId: String): Boolean {
        return activeStates[chatId] ?: false
    }

    // Сеттер для активности конкретного chatId
    fun setActive(chatId: String, isActive: Boolean) {
        activeStates[chatId] = isActive
        println("Changing activity for $chatId to $isActive")
    }

    suspend fun getState(text: String): BotState? {
        println("Урааааа $text", )
        if (text.contains(Regex("start"))) {
            executingTexts = null
            setExecuting(text, false)
        }
        return when {
            // Первая глава
            text.contains(Regex("А ведь совсем недавно я и сама как раз зарегистрировалась там...")) -> SexyResponseState()
            text.contains(Regex("Пойти за ней\uD83D\uDE0F")) -> SexyResponseState_one()
            text.contains(Regex(sexyResponseStory16_1)) -> SexyResponseState_two()
            text.contains(Regex(Regex.escape(sexyResponseStoryTwo26))) -> SexyResponseState_final()
            text.contains(Regex("Закончить читать рассказ")) -> SexyResponseState_foor()
            text.contains(Regex(Regex.escape(sexyResponseStoryFour6))) -> SexyResponseState_five()
            text.contains(Regex("Не смеши меня. Я и сама не всё о себе знаю")) -> SexyResponseState_six()
            text.contains(Regex("Ты очень точно описал моё состояние")) -> SexyResponseState_seven()
            // Вторая глава
            text.contains(Regex(sexyResponseStoryFour16)) -> SexyResponseLableTwo_One()
            text.contains(Regex(emilyResponse1)) -> SexyResponseLableTwo_photonFollowUp1()
            text.contains(Regex(emilyResponse2)) -> SexyResponseLableTwo_photonFollowUp2()
            text.contains(Regex(Strings.emilyAgree)) -> SexyResponseLableTwo_photonQuestion()
            text.contains(Regex(emilyRequest1)) -> SexyResponseLableTwo_emilyRequest1()
            text.contains(Regex(emilyRequest2)) -> SexyResponseLableTwo_emilyRequest2()
            text.contains(Regex(emilyDefend)) -> SexyResponseLableTwo_emilyDefend()
            text.contains(Regex(emilyJoke1)) -> SexyResponseLableTwo_emilyJoke1()
            text.contains(Regex(emilyPhoto)) -> SexyResponseLableTwo_emilyPhoto()
            text.contains(Regex(Strings.go)) -> SexyResponseLableTwo_go()
            text.contains(Regex(Strings.goContiniue)) -> SexyResponseLableTwo_goContiniue()
            text.contains(Regex(Strings.goToBack)) -> SexyResponseLableTwo_goToBack()
            text.contains(Regex(Strings.emilyGreeting)) -> SexyResponseLableTwo_emilyGreeting()
            text.contains(Regex(emilyGentleman1)) -> SexyResponseLableTwo_emilyGentleman1_or_emilyGentleman2()
            text.contains(Regex(emilyGentleman2)) -> SexyResponseLableTwo_emilyGentleman1_or_emilyGentleman2()
            text.contains(Regex(Strings.emilyFlirty)) -> SexyResponseLableTwo_emilyFlirty()
            text.contains(Regex(emilyQuestion)) -> SexyResponseLableTwo_emilyQuestion()
            text.contains(Regex(emilyAcceptance)) -> SexyResponseLableTwo_emilyAcceptance()
            text.contains(Regex(Strings.emilyExclamation)) -> SexyResponseLableTwo_emilyExclamation()
            text.contains(Regex(Strings.emilyPhoneDead)) -> SexyResponseLableTwo_emilyPhoneDead()
            text.contains(Regex(Strings.Lavel_3_Start)) -> InitialStateLableThree()
            text.contains(Regex(Strings.readMassege)) -> SexyResponseLableTwo_readMassege()
            text.contains(Regex(Strings.emilyTurnedOn)) -> SexyResponseLableTwo_emilyTurnedOn()
            text.contains(Regex(emilyTruth)) -> SexyResponseLableTwo_emilyTruth()
            text.contains(Regex(Strings.startEmilyStory)) -> SexyResponseLableTwo_startEmilyStory()
            text.contains(Regex(Strings.continiueStory)) -> SexyResponseLableTwo_continiueStory()
            text.contains(Regex(Strings.continiueStory2)) -> SexyResponseLableTwo_continiueStory2()
            text.contains(Regex(Regex.escape(emilyHonesty1))) -> SexyResponseLableTwo_emilyHonesty1_or_emilyHonesty2()
            text.contains(Regex(Strings.emilyHonesty2)) -> SexyResponseLableTwo_emilyHonesty1_or_emilyHonesty2()
            text.contains(Regex(Regex.escape(emilyCuriosity))) -> SexyResponseLableTwo_emilyCuriosity()
            text.contains(Regex(Strings.Lavel_4_Start)) -> InitialStateLableFoor()
            text.contains(Regex(Regex.escape(emilyWhyThere))) -> InitialStateLableFoor()
            text.contains(Regex(Strings.emilyExpensive)) -> InitialStateLableFooremilyExpensive()
            text.contains(Regex(Strings.emilyJokes)) -> InitialStateLableFooreemilyCompliments()
            text.contains(Regex(Strings.emilyCompliments)) -> InitialStateLableFooreemilyCompliments()
            text.contains(Regex(Strings.goTohome)) -> InitialStateLableFoogoTohome()
            text.contains(Regex(Strings.goToTheXex)) -> InitialStateLableFoogogoToTheXex()
            text.contains(Regex(Strings.nearingOrgasmGo)) -> InitialStateLableFoonearingOrgasmGo()
            text.contains(Regex(Strings.Lavel_5_Start)) -> InitialStateLableFive()
            text.contains(Regex(Regex.escape(emilyLegs))) -> InitialStateLableemilyLegs()
            text.contains(Regex(Strings.emilyReadyToFinish)) -> InitialStateLableemilyLegs()
            text.contains(Regex(Strings.emilyBossTrouble)) -> InitialStateLableemilyBossTrouble()
            text.contains(Regex(Regex.escape(emilyPresident))) -> InitialStateLableeemilyPresident()
            text.contains(Regex(Strings.emilyNotFair)) -> InitialStateLableemilyNotFair()
            text.contains(Regex(Strings.Lavel_6_Start)) -> InitialStateLableSix()
            text.contains(Regex(Regex.escape(emilyConcerned))) -> InitialStateLableEmilyConcerned()
            text.contains(Regex(Regex.escape(emilyMemory1))) -> InitialStateLableEmilyEmilyMemory1()
            text.contains(Regex(Regex.escape(emilyMemory2))) -> InitialStateLableEmilyEmilyMemory1()
            text.contains(Regex(Regex.escape(emilyAskDiscussion))) -> InitialStateLableemilyAskDiscussion()
            text.contains(Regex(Regex.escape(emilyPhotoResponse2))) -> InitialStateLableemilyPhotoResponse1()
            text.contains(Regex(Regex.escape(emilyPhotoResponse1))) -> InitialStateLableemilyPhotoResponse1()
            text.contains(Regex(Regex.escape(Lavel_7_Start))) -> InitialStateLableSeven()
            text.contains(Regex(Regex.escape(emilyClientOfficeStr))) -> InitialStateLableSevenemilyClientOfficeStr()
            text.contains(Regex(Regex.escape(emilyNoSleep1))) -> InitialStateLableSevenemilyNoSleep1()
            text.contains(Regex(Regex.escape(emilyNoSleep2))) -> InitialStateLableSevenemilyNoSleep1()
            text.contains(Regex(Regex.escape(emilyWorried1))) -> InitialStateLableSevendanConfidence1()
            text.contains(Regex(Regex.escape(emilyHopes))) -> InitialStateLableSevendanConfidence1()
            text.contains(Regex(Regex.escape(emilyConcern1))) -> InitialStateLableSevenemilyConcern2()
            text.contains(Regex(Regex.escape(emilyConcern2))) -> InitialStateLableSevenemilyConcern2()
            text.contains(Regex(Regex.escape(emilyShock1))) -> InitialStateLableSevenemilyShock2()
            text.contains(Regex(Regex.escape(emilyShock2))) -> InitialStateLableSevenemilyShock2()
            text.contains(Regex(Regex.escape(Lavel_8_Start))) -> Lavel8Start()
            text.contains(Regex(Regex.escape(emilyReply2))) -> emilyReply1Start()
            text.contains(Regex(Regex.escape(emilyReply1))) -> emilyReply1Start()
            text.contains(Regex(Regex.escape(emilyShame))) -> emilyShameStart()
            text.contains(Regex(Regex.escape(Strings.emilyRetort1))) -> emilyRetort2Start()
            text.contains(Regex(Regex.escape(Strings.emilyRetort2))) -> emilyRetort2Start()
            text.contains(Regex(Regex.escape(Strings.emilyAnger1))) -> emilyAngerStart()
            text.contains(Regex(Regex.escape(Strings.emilyAnger2))) -> emilyAngerStart()
            text.contains(Regex(Regex.escape(Strings.Lavel_9_Start))) -> Lavel9Start()
            text.contains(Regex(Regex.escape(Strings.emilyHello))) -> Lavel9StartemilyHello()
            text.contains(Regex(Regex.escape(Strings.emilyChallenge1))) -> Lavel9StaremilyChallenge2()
            text.contains(Regex(Regex.escape(Strings.emilyChallenge2))) -> Lavel9StaremilyChallenge2()
            text.contains(Regex(Regex.escape(Strings.emilyAngerFantasy1))) -> Lavel9StaremilyAngerFantasy1()
            text.contains(Regex(Regex.escape(Strings.emilyAngerFantasy2))) -> Lavel9StaremilyAngerFantasy1()
            text.contains(Regex(Regex.escape(Strings.emilyReply43))) -> Lavel9StaremilyReply43()
            text.contains(Regex(Regex.escape(Strings.emilyChoice1))) -> Lavel9StaremiemilyDesires()
            text.contains(Regex(Regex.escape(Strings.emilyChoice2))) -> Lavel9StaremiemilyDesires2()
            text.contains(Regex(Regex.escape(Strings.Lavel_10_Start))) -> Lavel10StartOne()
            text.contains(Regex(Regex.escape(Strings.emilyBreakup1))) -> Lavel10StartemilyBreakup1()
            text.contains(Regex(Regex.escape(Strings.emilyIndecision2))) -> Lavel10StartemilyBreakup1()
            text.contains(Regex(Regex.escape(Strings.emilyConfession1))) -> Lavel10emilyConfession1()
            text.contains(Regex(Regex.escape(Strings.emilyConfession2))) -> Lavel10emilyConfession1()
            text.contains(Regex(Regex.escape(Strings.emilyRejection1))) -> Lavel10emilyRejection1()
            text.contains(Regex(Regex.escape(Strings.emilyRejection2))) -> Lavel10emilyRejection1()
            text.contains(Regex(Regex.escape(Strings.Lavel_10_Start_two))) -> Lavel10Starttwo()
            text.contains(Regex(Regex.escape(Strings.emilyQuestionn))) -> Lavel10StartemilyQuestionn()
            text.contains(Regex(Regex.escape(Strings.emilyConfusion))) -> Lavel10StaremilyConfusion()
            text.contains(Regex(Regex.escape(Strings.emilyUncertainty))) -> Lavel10emilyUncertainty()
            text.contains(Regex(Regex.escape(Strings.emilyInvitation))) -> Lavel10emilyInvitation()
            text.contains(Regex(Regex.escape(Strings.emilyClimax111))) -> Lavel10emilyClimax111()
            text.contains(Regex(Regex.escape(Strings.writeboss))) -> Lavel10writeboss()
            text.contains(Regex(Regex.escape(Strings.Glave_1))) -> InitialStateLableOne()
            text.contains(Regex(Regex.escape(Strings.Glave_2))) -> SexyResponseLableTwo_One()
            text.contains(Regex(Regex.escape(Strings.Glave_3))) -> InitialStateLableThree()
            text.contains(Regex(Regex.escape(Strings.Glave_4))) -> InitialStateLableFoor()
            text.contains(Regex(Regex.escape(Strings.Glave_5))) -> InitialStateLableFive()
            text.contains(Regex(Regex.escape(Strings.Glave_6))) -> InitialStateLableSix()
            text.contains(Regex(Regex.escape(Strings.Glave_7))) -> InitialStateLableSeven()
            text.contains(Regex(Regex.escape(Strings.Glave_8))) -> Lavel8Start()
            text.contains(Regex(Regex.escape(Strings.Glave_9))) -> Lavel9Start()

            text.contains(Regex("start")) -> InitialStateLableOne()
            else -> InitialStateLableOneT()
        }
    }

    suspend fun setExecuting(text: String, isExecuting: Boolean) {
        mutex.withLock {
            executingTexts?.set(text, isExecuting)
        }
    }

    suspend fun setExecutingPhoto(photoUrl: String, isExecuting: Boolean) {
        mutex.withLock {
            executingTextsPhoto[photoUrl] = isExecuting
        }
    }

    fun isExecutingPhoto(text: String): Boolean {
        return executingJobsPhoto[text]?.isActive == true
    }

    fun isExecuting(text: String): Boolean {
        return executingJobs[text]?.isActive == true
    }
}