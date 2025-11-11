// OperationsOnCollections/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package operationsOnCollectionsExercise2

import atomictest.eq

val operation = { x: Int ->
	x in setOf(1, 5, 32)
}

val operation1 = { x: Int ->
	x % 5 == 0
}

val operation2 = { x: Int ->
	x.toString().contains('5')
}

fun main() {
	val first = listOf(1, 5, 32, 45, 70, 511)
	
	first.any(operation) eq true
	first.all(operation) eq false
	first.none(operation) eq false
	first.count(operation) eq 3
	
	first.any(operation1) eq true
	first.all(operation1) eq false
	first.none(operation1) eq false
	first.count(operation1) eq 3
	
	first.any(operation2) eq true
	first.all(operation2) eq false
	first.none(operation2) eq false
	first.count(operation2) eq 3
}
/*
true
false
false
3
true
false
false
3
true
false
false
3
 */