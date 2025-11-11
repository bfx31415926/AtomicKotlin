// NumberTypes/IntegerOverflow.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package NumberTypes

fun main() {
	val i: Int = Int.MAX_VALUE
	println(i + i)
}
/* Output:
-2
*/
