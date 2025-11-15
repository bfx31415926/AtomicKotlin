// InheritanceExtensions/Convention.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package InheritanceExtensions

class X

fun X.f() {
	println("X.f()")
}

class Y

fun Y.f() {
	println("Y.f()")
}

fun callF(x: X) = x.f()

fun callF(y: Y) = y.f()

fun main() {
	val x = X()
	val y = Y()
	x.f()
	y.f()
	callF(x)
	callF(y)
}
/*
X.f()
Y.f()
X.f()
Y.f()
 */