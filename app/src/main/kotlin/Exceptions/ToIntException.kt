// Exceptions/ToIntException.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package exceptions

fun erroneousCode() {
	// Uncomment this line to get an exception:
	val i = "1$".toInt()        // [1]
}

fun main() {
	erroneousCode()
}
/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "1$"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:661)
	at java.base/java.lang.Integer.parseInt(Integer.java:777)
	at exceptions.ToIntExceptionKt.erroneousCode(ToIntException.kt:7)
	at exceptions.ToIntExceptionKt.main(ToIntException.kt:11)
	at exceptions.ToIntExceptionKt.main(ToIntException.kt)
*/