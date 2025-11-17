//Показывает, как вывести имя вызываемой функции
package myPackage

fun getCallingFunctionName(): String {
	val stackTrace = Thread.currentThread().stackTrace
	// stackTrace[0] - getStackTrace
	// stackTrace[1] - getCallingFunctionName
	// stackTrace[2] - вызывающая функция
	return stackTrace[2].methodName
}

fun someFunction() {
	println("Called from: ${getCallingFunctionName()}")
}

fun main() {
	someFunction() // Выведет: Called from: someFunction
}
/*
Called from: someFunction
 */