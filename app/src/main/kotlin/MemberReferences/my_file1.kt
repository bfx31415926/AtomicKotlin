package MemberReferences

import atomictest.eq

fun times47(k: Int) = k.times(47)

fun goInt(n: Int, g: (Int) -> Int) = g(n)

fun main() {
	goInt(12, ::times47) eq 564
}
/*
564
 */