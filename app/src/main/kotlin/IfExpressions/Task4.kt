// IfExpressions/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package IfExpressions

fun oneOrTheOther1(exp: Boolean) =
	if (exp)
		"True!"
	else
		"False"

fun main() {
	val x = 1
	println(oneOrTheOther1(x == 1))  // True!
}
/*
True!
 */