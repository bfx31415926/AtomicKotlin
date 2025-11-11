// InKeyword/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package InKeyword

fun isLowerCase(ch: Char): Boolean = ch in 'a'..'z'

fun main() {
	println(isLowerCase('A'))
	println(isLowerCase('b'))
}
/*
false
true
 */
