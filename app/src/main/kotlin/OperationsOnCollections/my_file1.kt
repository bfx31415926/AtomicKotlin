package OperationsOnCollections

import atomictest.eq

data class Product(
	val description: String,
	val price: Double?
)

fun main() {
	val products = listOf(
		Product("bread", null),
		Product("wine", 5.0)
	)
	
	val products1 = listOf(
		Product("bread", null),
		Product("wine", 5.0)
	)
	
	products.minByOrNull { it.price ?: Double.MAX_VALUE } eq
			Product("wine", 5.0)
	products1.minByOrNull { it.price ?: Double.MAX_VALUE } eq
			Product("wine", 5.0)
	products.minByOrNull { it.price ?: 1.0 } eq
			Product("bread", null)
}
/*
Product(description=wine, price=5.0)
Product(description=wine, price=5.0)
Product(description=bread, price=null)
 */