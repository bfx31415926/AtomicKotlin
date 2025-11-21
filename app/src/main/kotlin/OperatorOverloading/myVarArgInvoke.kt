package operatoroverloading

import atomictest.eq

operator fun Func.invoke(vararg numbers: Int): String {
	var result = ""
	for (i in numbers) {
		result += "[$i]"
	}
	return result
}

class Func1 {
	operator fun invoke(vararg numbers: Int): String {
		var result = ""
		for (i in numbers) {
			result += "[$i]"
		}
		return result
	}
}

fun main() {
	val f = Func()
	f(1, 2, 3, 4) eq "[1][2][3][4]"
	
	val f1 = Func1()
	f1(11, 22, 33, 44) eq "[11][22][33][44]"
}
/*
[1][2][3][4]
[11][22][33][44]
 */