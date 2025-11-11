package OperationsOnCollections

import atomictest.eq

fun main() {
	val set = setOf("a", null, "ab", "ac", null)
	set.maxByOrNull { it?.length ?: 0 }?.length eq 2
	set.maxByOrNull { it?.length ?: 3 }?.length eq null //здесь очень тонко:
	//хотя 3 > 2 для null-элемента,
	//но для null-элемента нельзя измерить длину строки
}
/*
2
null
 */