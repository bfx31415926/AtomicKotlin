// Composition/Task1.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package Composition

import atomictest.*

open class Shape(
	val name: String,
	open val color: String
) {
	fun draw() = "drawing $color $name"
}

class Circle(
	val radius: Int,
	color: String
) : Shape("circle of radius $radius", color)

class Rectangle(
	val height: Int,
	val width: Int,
	color: String
) : Shape("rectangle of size ${height}x$width", color)

fun main() {
	val circle = Circle(10, "red")
	val rectangle = Rectangle(3, 4, "blue")
	trace(circle.draw())
	trace(rectangle.draw())
	trace eq """
    drawing red circle of radius 10
    drawing blue rectangle of size 3x4
  """
	circle.color eq "red"
	rectangle.color eq "blue"
}
/*
drawing red circle of radius 10
drawing blue rectangle of size 3x4
red
blue
 */