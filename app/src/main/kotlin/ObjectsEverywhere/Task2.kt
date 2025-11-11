// ObjectsEverywhere/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package ObjectsEverywhere

fun isPalIgnoreCase(s: String): Boolean =
	isPalindrome(s.lowercase())

fun main() {
	println(isPalIgnoreCase("Mom"))
}
/*
true
 */
