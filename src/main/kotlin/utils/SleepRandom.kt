package utils

import kotlinx.coroutines.delay
import kotlin.random.Random

suspend fun sleepRandomTime(minSeconds: Int, maxSeconds: Int) {
    val randomSeconds = Random.nextInt(minSeconds, maxSeconds + 1)
    delay(randomSeconds * 1000L)
}
