package creatingGenericsExercise2

import creatinggenerics.Crate
import atomictest.eq

class K {
	override fun toString() = "K"
}

fun main() {
	val intCrates = CrateList<K>()
	(0..7).forEach { intCrates.add(K()) }
	intCrates eq
			"[[K], [K], [K], [K], [K], [K], [K], [K]]"
}
/*
[[K], [K], [K], [K], [K], [K], [K], [K]]
 */