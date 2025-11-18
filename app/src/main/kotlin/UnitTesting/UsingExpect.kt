/*
Чтобы работал import kotlin.test,
нужно добавить в файл build.gradle.kts:
dependencies {
	.......
	-------
	// For tests in src/main/kotlin
	implementation(kotlin("test"))
}
не забыв затем выполнить "Sync All Gradle Projects"
 */
package unittesting

import atomictest.*
import kotlin.test.*

fun testFortyTwo2(n: Int = 42) {
	expect(n, "Incorrect,") { fortyTwo() }
}

fun main() {
	testFortyTwo2()
	capture {
		testFortyTwo2(43)
	} contains
			/* Пришлось подправить:
			Было:
    listOf("expected:", "<43> but was:", "<42>")
			 */
			listOf(
				"Expected",
				"<43>", "actual", "<42>"
			)
	assertFails { testFortyTwo2(43) }
	capture {
		assertFails { testFortyTwo2() }
	} contains
			listOf(
				"Expected an exception",
				"to be thrown",
				"but was completed successfully."
			)
	assertFailsWith<AssertionError> {
		testFortyTwo2(43)
	}
	capture {
		assertFailsWith<AssertionError> {
			testFortyTwo2()
		}
	} contains
			listOf(
				"Expected an exception",
				"to be thrown",
				"but was completed successfully."
			)
}
/*
Вывода не должно быть!
 */