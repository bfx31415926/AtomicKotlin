/*
Чтобы работал import kotlin.test,
нужно добавить в файл build.gradle.kts:
dependencies {
	.......
	-------
	// For tests in src/main/kotlin
	implementation(kotlin("test"))
},
не забыв затем выполнить "Sync All Gradle Projects"
 */
package unittesting

import kotlin.test.assertEquals
import kotlin.test.assertTrue
import atomictest.*

fun fortyTwo() = 42

fun testFortyTwo(n: Int = 42) {
	assertEquals(
		expected = n,
		actual = fortyTwo(),
		message = "Incorrect,"
	)
}

fun allGood(b: Boolean = true) = b

fun testAllGood(b: Boolean = true) {
	assertTrue(allGood(b), "Not good")
}

fun main() {
	testFortyTwo()
	testAllGood()
	capture {
		testFortyTwo(43)
	} contains
			/* Пришлось подправить:
			Было:
			    listOf("expected:", "<43>", "but was", "<42>")
			 */
			listOf(
				"Expected", "<43>",
				"actual", "<42>"
			)
	capture {
		testAllGood(false)
	} contains listOf("Error", "Not good")
}
/*
Вывода не должно быть!
 */