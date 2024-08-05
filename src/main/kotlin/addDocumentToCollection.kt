import com.google.firebase.cloud.FirestoreClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*
import kotlin.concurrent.thread

fun addDocumentToCollection(chatId: String, username: String) {
    val db = FirestoreClient.getFirestore()
    val docRef = db.collection("subscriptions").document(chatId)

    val subscriptionData = mapOf(
        "isSubscribed" to false,  // Начальное значение
        "subscriptionEndDate" to Date(),  // Установите текущую дату или любую другую начальную дату
        "username" to username  // Добавляем username
    )

    CoroutineScope(Dispatchers.IO).launch {
        try {
            docRef.set(subscriptionData).get()  // Blocking call inside coroutine context
            println("Document added to 'subscriptions' collection successfully.")
        } catch (e: Exception) {
            println("Error adding document to 'subscriptions' collection: ${e.message}")
        }
    }
}