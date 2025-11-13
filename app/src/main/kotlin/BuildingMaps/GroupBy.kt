package org.example.app.BuildingMaps// BuildingMaps/GroupBy.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import buildingmaps.*
import atomictest.eq

fun main() {
	val map: Map<Int, List<Person>> =
		people().groupBy(Person::age)
	map[15] eq listOf(Person("Arthricia", 15))
	map[21] eq listOf(
		Person("Alice", 21),
		Person("Charlie", 21),
		Person("Franz", 21)
	)
	map[22] eq null
	map[25] eq listOf(
		Person("Bob", 25),
		Person("Bill", 25)
	)
	map[33] eq listOf(Person("Revolio", 33))
	map[42] eq listOf(
		Person("Birdperson", 42),
		Person("Crocubot", 42)
	)
}
/*
[Person(name=Arthricia, age=15)]
[Person(name=Alice, age=21), Person(name=Charlie, age=21), Person(name=Franz, age=21)]
null
[Person(name=Bob, age=25), Person(name=Bill, age=25)]
[Person(name=Revolio, age=33)]
[Person(name=Birdperson, age=42), Person(name=Crocubot, age=42)]
 */