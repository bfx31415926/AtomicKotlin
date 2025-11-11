/*
Не забыть отредактировать [Edit Configuration]?
где в качестве параметров программы ввести: hamster  42  3.14159
 */
package Varargs

fun main(args: Array<String>) {
	if (args.size < 3) return
	val first = args[0]
	val second = args[1].toInt()
	val third = args[2].toFloat()
	println("$first  $second  $third")
}
/*
hamster  42  3.14159
 */