package HigherOrderFunctions

import atomictest.*

fun my_repeat(
	times: Int,
	action: () -> Unit           // [1]
) {
	for (index in 0 until times) {
		action()                 // [2]
	}
}

fun myAction1(): Unit {
	println("something")
}

fun main() {
	my_repeat(3) { myAction1() }     // [3]
	val action2: () -> Unit = {
		println("something else")
		println("something else")
	}
	my_repeat(3) { action2() }
	
	repeat(5) { println("again") }
}
/*
something
something
something
something else
something else
something else
something else
something else
something else
again
again
again
again
again
 */