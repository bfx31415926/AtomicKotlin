// Exceptions/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package exceptionsExercise1

fun main() {
  println("Can't be converted to double: 1,2")

  println("12".toDouble())
  println("1.2".toDouble())
  //println("1,2".toDouble())
  println("1.2e0".toDouble())
  println("1.2e1".toDouble())
  println("1.2e2".toDouble())
  println("1.2e3".toDouble())
  println("1.2e10".toDouble())
  println(("12.3e10").toDouble())
  println("1.2e-1".toDouble())
  println("1.2e-10".toDouble())
}
/*
Can't be converted to double: 1,2
12.0
1.2
1.2
12.0
120.0
1200.0
1.2E10
1.23E11
0.12
1.2E-10
 */