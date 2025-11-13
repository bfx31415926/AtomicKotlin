package org.example.app.BuildingMaps// BuildingMaps/AssociateWith.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import buildingmaps.*
import atomictest.eq

fun main() {
	val map: Map<Person, String> =
		people().associateWith { it.name }
	map eq mapOf(
		Person("Alice", 21) to "Alice",
		Person("Arthricia", 15) to "Arthricia",
		Person("Bob", 25) to "Bob",
		Person("Bill", 25) to "Bill",
		Person("Birdperson", 42) to "Birdperson",
		Person("Charlie", 21) to "Charlie",
		Person("Crocubot", 42) to "Crocubot",
		Person("Franz", 21) to "Franz",
		Person("Revolio", 33) to "Revolio"
	)
}
/*
{Person(name=Alice, age=21)=Alice, Person(name=Arthricia, age=15)=Arthricia, Person(name=Bob, age=25)=Bob, Person(name=Bill, age=25)=Bill, Person(name=Birdperson, age=42)=Birdperson, Person(name=Charlie, age=21)=Charlie, Person(name=Crocubot, age=42)=Crocubot, Person(name=Franz, age=21)=Franz, Person(name=Revolio, age=33)=Revolio}
 */