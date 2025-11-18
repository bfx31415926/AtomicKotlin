package ExtensionLambdas

class A {
	fun af() = 1
}

class B {
	fun bf() = 2
}

fun f1(lambda: (A, B) -> Int) =
	lambda(A(), B())

fun f2(lambda: A.(B) -> Int) =
	A().lambda(B())

fun lambdas() {
	println(f1 { aa, bb -> aa.af() + bb.bf() })
	println(f2 { af() + it.bf() }) //или то же самое: println(f2 { this.af() + it.bf() })
}

fun main() {
	lambdas()
}
/*
3
3
 */