import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import java.io.FileInputStream

fun initializeFirebase() {
    val serviceAccount = FileInputStream("noveeelllaaafinaaal-firebase-adminsdk-fdlum-6ed5eecb7f.json")

    val options = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .setDatabaseUrl("https://noveeelllaaafinaaal.firebaseio.com")
        .build()

    FirebaseApp.initializeApp(options)
}
