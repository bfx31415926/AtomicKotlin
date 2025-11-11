// Testing/UsingTrace.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package Testing

import atomictest.*

fun main() {
	trace("Hello,")
	trace(47)
	trace("World!")
	trace eq """
    Hello,
    47
    World!
  """
}
/*
Hello,
47
World!
 */