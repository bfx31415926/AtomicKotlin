package myPets

open class Pet {
	override fun toString() = "Pet"
}

class Cat : Pet() {
	override fun toString() = "Cat"
}

class Dog : Pet() {
	override fun toString() = "Dog"
}
