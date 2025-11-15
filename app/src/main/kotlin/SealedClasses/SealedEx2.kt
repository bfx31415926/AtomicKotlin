//Подправил код: включил sortedBy т.к. порядок следования sealed подклассов может отличаться
//от того, в каком порядке эти подклассы создавались в соответствующем файле.
// SealedClasses/SealedEx2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package sealedClassesExercise2

import sealedClassesExercise1.*
import atomictest.*

fun main() {
	Transport::class.sealedSubclasses
		.map { it.simpleName }.sortedBy { it }
		.forEach { trace(it) }
	trace eq """
		Bus
		Plane
		Train
		Tram
    """
}
/*
Bus
Plane
Train
Tram
 */