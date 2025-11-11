// CreatingClasses/Task5.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package CreatingClasses

fun cap(s: String) = s.capitalize() //deprecated
fun cap1(s: String) = s.replaceFirstChar { it.uppercase() }

fun main() {
	println(cap("hi!"))
	println(cap("Hi!"))
	
	println(cap1("hi!"))
	println(cap1("Hi!"))
}
/* Output:
Hi!
Hi!
Hi!
Hi!
 */
