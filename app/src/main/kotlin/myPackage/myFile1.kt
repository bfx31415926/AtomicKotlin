package MyPackage

import companionObjectsExercise3.ID
import companionObjectsExercise3.ID.Companion.size
import kotlin.random.Random

fun main() {
	val size = 10
	val r = Random(47)
	val source = '0'..'2'
	
	for (i in 1..5) {
		println((0..2).map { source.random(r) }
			.joinToString(""))
	}
}
/*
002
021
001
222
002
 */