// StringTemplates/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package StringTemplates

fun findMax(first: Int, second: Int): Int =
	if (first > second) first else second

fun main() {
	val first = 17
	val second = 31
	println(
		"The maximum of $first and $second is " +
				"${findMax(first, second)}."
	)
}
/*
The maximum of 17 and 31 is 31.
 */