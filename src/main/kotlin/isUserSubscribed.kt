import com.google.firebase.cloud.FirestoreClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

suspend fun isUserSubscribed(chatId: String): Boolean {
    val db = FirestoreClient.getFirestore()
    val docRef = db.collection("subscriptions").document(chatId)

    return try {
        val document = withContext(Dispatchers.IO) {
            docRef.get().get(10, TimeUnit.SECONDS)
        }
        val isSubscribed = document?.getBoolean("isSubscribed") ?: false
        val subscriptionEndDate = document?.getDate("subscriptionEndDate") ?: Date()
        val currentDate = Date()

        isSubscribed && currentDate.before(subscriptionEndDate)
    } catch (e: Exception) {
        e.printStackTrace()
        false
    }
}