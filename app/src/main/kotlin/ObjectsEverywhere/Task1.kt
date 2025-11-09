// ObjectsEverywhere/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package ObjectsEverywhere

fun isPalindrome(s: String): Boolean = s.reversed() == s

fun main() {
  println(isPalindrome("mom"))
  println(isPalindrome("street"))
}
/*
true
false
 */