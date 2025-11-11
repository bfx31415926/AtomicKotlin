package org.example.app.NamedAndDefaultArgs// NamedAndDefaultArgs/CreateString2.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
import atomictest.eq

fun main() {
	val list = listOf(1, 2, 3)
	list.joinToString(". ", "", "!") eq
			"1. 2. 3!"
	list.joinToString(
		separator = ". ",
		postfix = "!"
	) eq "1. 2. 3!"
}
/*
1. 2. 3!
1. 2. 3!
 */