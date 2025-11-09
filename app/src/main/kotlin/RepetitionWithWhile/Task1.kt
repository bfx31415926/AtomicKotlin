// RepetitionWithWhile/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package repetitionWithWhile

fun displayContent(s: String) {
  var i = 0
  while (i < s.length) {
    println(s[i])
    i++
  }
}

fun main() {
displayContent("abc")
}
/* Expected output:
a
b
c
*/
