// ScopeFunctions/AndNullability.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package scopefunctions

import atomictest.eq
import kotlin.random.Random

fun gets(): String? =
	if (Random.nextBoolean()) "str!" else null

fun main() {
	gets()?.let {
		it.removeSuffix("!") + it.length
	}?.eq("str4")
}
/*
либо выводит "str4", либо ничего (из-за рандомности)
 */