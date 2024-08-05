import com.google.firebase.cloud.FirestoreClient
import java.util.*
import kotlin.concurrent.thread

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.Calendar

suspend fun updateSubscriptionStatus(chatId: String, days: Int) {
    val db = FirestoreClient.getFirestore()
    val calendar = Calendar.getInstance()
    calendar.add(Calendar.DAY_OF_YEAR, days)
    val subscriptionEndDate = calendar.time

    val subscriptionData = mapOf(
        "isSubscribed" to true,
        "subscriptionEndDate" to subscriptionEndDate
    )

    CoroutineScope(Dispatchers.IO).launch {
        try {
            db.collection("subscriptions").document(chatId).set(subscriptionData).get()  // Blocking call inside coroutine context
            println("Subscription status updated successfully.")
        } catch (e: Exception) {
            println("Error updating subscription status: ${e.message}")
        }
    }
}
