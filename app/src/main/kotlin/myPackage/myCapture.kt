package myPackage
import atomictest.*

fun main() {
	var k = 0;

	capture {
		k = 10
	} eq "$ERROR_TAG Expected an exception"

	capture {
		k / 0
	} eq "ArithmeticException: / by zero"

	capture {
		k / 0
	} contains listOf( "ArithmeticException:", "/ by zero" )
}
/*
[Error]:  Expected an exception
ArithmeticException: / by zero
 */