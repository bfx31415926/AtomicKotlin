// ManipulatingLists/Task4.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package manipulatingListsExercise4

import atomictest.eq

class Person(
	val name: String
) {
	val friends: MutableList<Person> = mutableListOf()
	
	override fun toString() = "($name, friends: ${friends.map { it.name }})"
}

fun friendSuggestions(person: Person): Set<Person> {
	return (person.friends.flatMap { it.friends }.toSet() - person.friends - person)
}

fun main() {
	val alice = Person("Alice")
	val bob = Person("Bob")
	val charlie = Person("Charlie")
	alice.friends += bob
	bob.friends += alice
	bob.friends += charlie
	charlie.friends += bob
	friendSuggestions(alice) eq setOf(charlie)
	
	val alex = Person("Alex")
	val ira = Person("Ira")
	val ivan = Person("Ivan")
	val nina = Person("Nina")
	val egor = Person("Egor")
	alex.friends += ira
	ira.friends += alex
	alex.friends += nina
	nina.friends += alex
	ira.friends += ivan
	nina.friends += egor
	ivan.friends += ira
	egor.friends += nina
	friendSuggestions(alex) eq setOf(egor, ivan)
	/*
	[(Charlie, friends: [Bob])]
	[(Ivan, friends: [Ira]), (Egor, friends: [Nina])]
	 */
	
	
}
