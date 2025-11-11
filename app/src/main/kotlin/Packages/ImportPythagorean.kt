// Packages/ImportPythagorean.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package Packages

import pythagorean.RightTriangle

fun main() {
	val rt = RightTriangle(3.0, 4.0)
	println(rt.hypotenuse())
	println(rt.area())
}
/* Output:
5.0
6.0
*/
