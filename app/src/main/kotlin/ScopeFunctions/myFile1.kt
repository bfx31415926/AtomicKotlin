// ScopeFunctions/NullGnome.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package ScopeFunctions

import scopefunctions.*
import atomictest.*

fun whichGnome(gnome: Gnome?) {
	trace(gnome?.name)
	gnome?.let { trace(it.who()) }
	gnome.let { trace(it?.who()) }
	gnome?.run { trace(who()) }
	gnome.run { trace(this?.who()) }
	gnome?.apply { trace(who()) }
	gnome.apply { trace(this?.who()) }
	gnome?.also { trace(it.who()) }
	gnome.also { trace(it?.who()) }
	with(gnome) { trace(this?.who()) }
}

fun main() {
	trace("------------------")
	whichGnome(Gnome("Bob"))
	trace("------------------")
	whichGnome(null)
	trace("------------------")
	with(null) { trace(null) }
	trace("------------------")
	trace eq """
------------------
Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
------------------
null
null
null
null
null
null
------------------
null
------------------
  """
}
/*
------------------
Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
------------------
null
null
null
null
null
null
------------------
null
------------------
 */