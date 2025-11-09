// InKeyword/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package InKeyword

fun getAlphabet(): String {
  var s = ""
  for (c in 'a'..'z') {
    s += c
  }
  return s
}

fun main() {
  println(getAlphabet())
}
/*
abcdefghijklmnopqrstuvwxyz
 */
