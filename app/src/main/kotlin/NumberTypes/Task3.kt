// NumberTypes/Task3.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package numberTypes

fun convertFahrenheitToCelsius(f: Int): Double =
  (f - 32) * 5.0 / 9

fun convertCelsiusToFahrenheit(c: Int): Double =
  c * 9.0 / 5 + 32

fun main() {
  println(convertFahrenheitToCelsius(68))
  println(convertCelsiusToFahrenheit(20))
}
/*
20
68
 */
