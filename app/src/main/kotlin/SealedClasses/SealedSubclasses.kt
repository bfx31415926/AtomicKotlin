//Подправил код: включил sortedBy т.к. порядок следования sealed подклассов может отличаться
//от того, в каком порядке эти подклассы создавались в соответствующем файле.
// SealedClasses/SealedSubclasses.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package sealedclasses

import atomictest.eq

sealed class Top
class Middle1 : Top()
class Middle2 : Top()
open class Middle3 : Top()
class Bottom3 : Middle3()

fun main() {
	Top::class.sealedSubclasses
		.map { it.simpleName }.sortedBy { it } eq
			"[Middle1, Middle2, Middle3]"
}
/*
[Middle1, Middle2, Middle3]
 */