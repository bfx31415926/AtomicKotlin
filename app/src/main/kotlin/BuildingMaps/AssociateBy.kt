package org.example.app.BuildingMaps// BuildingMaps/AssociateBy.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import buildingmaps.*
import atomictest.eq

fun main() {
	val map: Map<String, Person> =
		people().associateBy { it.name }
	map eq mapOf(
		"Alice" to Person("Alice", 21),
		"Arthricia" to Person("Arthricia", 15),
		"Bob" to Person("Bob", 25),
		"Bill" to Person("Bill", 25),
		"Birdperson" to Person("Birdperson", 42),
		"Charlie" to Person("Charlie", 21),
		"Crocubot" to Person("Crocubot", 42),
		"Franz" to Person("Franz", 21),
		"Revolio" to Person("Revolio", 33)
	)
}
/*
{Alice=Person(name=Alice, age=21), Arthricia=Person(name=Arthricia, age=15), Bob=Person(name=Bob, age=25), Bill=Person(name=Bill, age=25), Birdperson=Person(name=Birdperson, age=42), Charlie=Person(name=Charlie, age=21), Crocubot=Person(name=Crocubot, age=42), Franz=Person(name=Franz, age=21), Revolio=Person(name=Revolio, age=33)}
 */