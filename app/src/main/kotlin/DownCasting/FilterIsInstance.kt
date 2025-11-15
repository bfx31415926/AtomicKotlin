package org.example.app.DownCasting// DownCasting/FilterIsInstance.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import downcasting.*
import atomictest.eq

fun main() {
	val humans1: List<Creature> =
		group.filter { it is Human }
	humans1.size eq 2
	val humans2: List<Human> =
		group.filterIsInstance<Human>()
	humans2 eq humans1
}
/*
2
[downcasting.Human@1d56ce6a, downcasting.Human@5197848c]
 */