fun main() {
	var i = 7
	val j = 5
	
	val add: (Int, Int) -> Int = Int::plus
	i = add(i, j)
	
	println(i) // Вывод: 12
}