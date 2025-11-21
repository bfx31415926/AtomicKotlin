package myTwoDelegateProperties

import kotlin.reflect.KProperty

class BasicRead {
	operator fun getValue(thisRef: Readable, property: KProperty<*>): String {
		return "Value from ${property.name} with i = ${thisRef.i}"
	}
}

class Readable(val i: Int) {
	val value: String by BasicRead()
	val anotherValue: String by BasicRead() // Используем тот же делегат
}

fun main() {
	val readable = Readable(10)
	println(readable.value)        // Вывод: Value from value with i = 10
	println(readable.anotherValue) // Вывод: Value from anotherValue with i = 10
}
/*
Value from value with i = 10
Value from anotherValue with i = 10
 */