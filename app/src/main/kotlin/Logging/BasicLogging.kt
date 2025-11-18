//Чтобы логирование в этом файле успешно сработало,
//нужно добавить в build.gradle.ktd зависимость:
/*
dependencies {
	.........
	.........
	// Logging
	implementation("io.github.microutils:kotlin-logging:1.4.6")
	implementation("org.slf4j:slf4j-simple:1.7.25")
}
 */
// не забыв затем выполнить "Sync All Gradle Projects"

package logging

import mu.KLogging

private val log = KLogging().logger

fun main() {
	val msg = "Hello, Kotlin Logging!"
	log.trace(msg)
	log.debug(msg)
	log.info(msg)
	log.warn(msg)
	log.error(msg)
}
/*
[main] INFO mu.KLogging - Hello, Kotlin Logging!
[main] WARN mu.KLogging - Hello, Kotlin Logging!
[main] ERROR mu.KLogging - Hello, Kotlin Logging!
 */