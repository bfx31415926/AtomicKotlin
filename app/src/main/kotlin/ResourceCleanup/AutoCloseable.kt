//Для успешной отработки программы
// должен быть педварительно запущен файл PostConditions.kt(CheckInstructions)
package ResourceCleanup

import atomictest.eq
import checkinstructions.DataFile

fun main() {
	DataFile("Results.txt")
		.bufferedReader()
		.use { it.readLines().first() } eq
			"Results"
}
