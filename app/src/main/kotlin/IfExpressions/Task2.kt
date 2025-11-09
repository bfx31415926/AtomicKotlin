// IfExpressions/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package IfExpressions

fun abs(number: Int): Int =
  if (number >= 0) number else -number

fun main() {
  println(abs(-19))  // 19
}
/*
19
 */
