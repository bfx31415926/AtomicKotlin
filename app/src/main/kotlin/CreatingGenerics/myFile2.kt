package creatingGenericsExercise3

import myPets.*
import atomictest.eq

fun main() {
	val catBox: Box<Cat> = Box(Cat())
	var outBoxAny: OutBox<Any> = catBox
	var a: Any = outBoxAny.get()
	a eq "Cat"
	val intBox: Box<Int> = Box(217)
	outBoxAny = intBox
	a = outBoxAny.get()
	a eq 217
}
/*
Cat
217
 */