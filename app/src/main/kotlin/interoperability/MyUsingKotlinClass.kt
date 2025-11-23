// interoperability/UsingKotlinClass.java
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package interoperability

import atomictest.eq
import interop.Basic

fun main() {
	val b = Basic()
	b.property1 eq 1
	b.value() eq 10
}
/*
1
10
 */