// ManipulatingLists/Task5.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package manipulatingListsExercise5

import atomictest.eq

fun <T, R> List<T>.flatMap1(f: (T) -> List<R>): List<R> =
	map(f).flatten()

fun <T, R> List<T>.flatMap2(f: (T) -> List<R>): List<R> =
	flatMap(f)

fun main() {
	val list = listOf(3, 1, 4)
	
	list.flatMap1 { (0..it).toList() } eq
			listOf(0, 1, 2, 3, 0, 1, 0, 1, 2, 3, 4)

	list.flatMap2 { (0..it).toList() } eq
			listOf(0, 1, 2, 3, 0, 1, 0, 1, 2, 3, 4)
}
/*
[0, 1, 2, 3, 0, 1, 0, 1, 2, 3, 4]
[0, 1, 2, 3, 0, 1, 0, 1, 2, 3, 4]
 */