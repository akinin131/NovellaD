plugins {
    kotlin("jvm") version "1.9.0"
    application
    id("com.github.johnrengelman.shadow") version "8.1.0" // Добавьте этот плагин
}

group = "org.novelladouble"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.code.gson:gson:2.8.9") // Latest version of Gson without CVE-2022-25647

    implementation("com.squareup.retrofit2:retrofit:2.9.0") // Latest version of Retrofit without CVE-2018-1000850
    implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.0.6") // Latest secure version of Kotlin Telegram Bot library
    implementation("org.jsoup:jsoup:1.14.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")

    implementation("org.telegram:telegrambotsextensions:6.8.0")
    // Для поддержки Kotlin DSL в Telegram Bot также потребуется:
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    // Other dependencies...
    implementation("org.telegram:telegrambots-spring-boot-starter:6.5.0")
    implementation("com.google.firebase:firebase-admin:9.1.1")



}


tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = application.mainClass.get()
    }
}
tasks.register<Jar>("fatJar") {
    archiveClassifier.set("all")
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    with(tasks.jar.get() as CopySpec)
}