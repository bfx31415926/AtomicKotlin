/* Доработанная версия файла Molecule.kt
   Если не менять версию Molecule.kt, то после строк:
m2 + m1
m2 eq   "Molecule(id=1, attached=" +
		"Molecule(id=0, attached=NOT null))"
		
возникает переполнение стека!
*/
package OperatorOverloading

import atomictest.eq

data class Molecule(
	val id: Int = idCount++,
	var attached: Molecule? = null
) {
	var other: Molecule? = null

	companion object {
		private var idCount = 0
	}
	
	operator fun plus(other: Molecule) {
		attached = other
		this.other = other
	}

	override fun toString() = buildString {
		append("Molecule(id=$id, attached=Molecule(id=${other?.id}, attached=")
		append( if( other?.attached == null ) "null" else "NOT null")
		append( "))" )
	}

}

fun main() {
	val m1 = Molecule()
	val m2 = Molecule()
	m1 + m2
	m1 eq "Molecule(id=0, attached=" +
			"Molecule(id=1, attached=null))"
	m2 + m1
	m2 eq "Molecule(id=1, attached=" +
			"Molecule(id=0, attached=NOT null))"
}
/*
Molecule(id=0, attached=Molecule(id=1, attached=null))
Molecule(id=1, attached=Molecule(id=0, attached=NOT null))
 */