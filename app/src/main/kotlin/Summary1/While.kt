// Summary1/While.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package Summary1

fun testCondition(i: Int) = i < 100

fun main() {
	var i = 0
	while (testCondition(i)) {
		print(".")
		i += 10
	}
}
/* Output:
..........
*/
