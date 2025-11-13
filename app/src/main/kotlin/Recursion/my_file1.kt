// Recursion/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package Recursion

import atomictest.eq

class City(val name: String) {
	val connections = mutableListOf<City>()
	
	override fun toString() = "($name, " +
//			"connections: ${connections.map { it.name }})"
			"connections: ${connections})"
}

fun main() {
	val dublin = City("Dublin")
	val liverpool = City("Liverpool")
	val manchester = City("Manchester")
	val leeds = City("Leeds")
	
	dublin.connections += liverpool
	dublin.connections += manchester
	dublin.connections += leeds
	
	println(dublin)
}
