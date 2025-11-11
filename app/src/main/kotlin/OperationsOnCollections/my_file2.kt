package OperationsOnCollections

import atomictest.eq

fun main() {
	val list = listOf(-3, -1, 5, 7, 10)
	
	val (pos, neg) = list.partition { it < 0 }
	pos eq "[-3, -1]"
	neg eq "[5, 7, 10]"
}
/*
[-3, -1]
[5, 7, 10]
 */