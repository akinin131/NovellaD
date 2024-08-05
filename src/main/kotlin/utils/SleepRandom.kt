package utils

import kotlin.random.Random

fun sleepRandomTime(minSeconds: Int, maxSeconds: Int) {
    // Генерируем случайное время в диапазоне от minSeconds до maxSeconds
    val randomTime = Random.nextInt(minSeconds, maxSeconds + 1)
    // Переводим время в миллисекунды и выполняем ожидание
    Thread.sleep(randomTime * 1000L)
}