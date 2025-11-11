// CreatingClasses/Task2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package CreatingClasses

class mYGiraffe {
	fun displayID() {
		println(toString().substringAfter('@'))
	}
}

fun main() {
	val giraffe1 = mYGiraffe()
	val giraffe2 = mYGiraffe()
	val giraffe3 = mYGiraffe()
	giraffe1.displayID()
	giraffe2.displayID()
	giraffe3.displayID()
}
/* например:
1f32e575
58372a00
4dd8dc3
 */
