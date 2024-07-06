package org.example.lesson_19

fun main() {
    val product1 = Product("Рубашка", "1", ProductCategory.CLOTHES)
    val product2 = Product("Ручка", "2", ProductCategory.STATIONERY)
    val product3 = Product("Мяч", "3", ProductCategory.OTHERS)

    println(product1.getDescription())
    println(product2.getDescription())
    println(product3.getDescription())
}

enum class ProductCategory {
    CLOTHES,
    STATIONERY,
    OTHERS;

    fun getName(): String {
        return when (name) {
            "STATIONERY" -> "Канцелярские товары"
            "CLOTHES" -> "Одежда"
            else -> "Разное"
        }
    }
}

class Product(val name: String, val id: String, val category: ProductCategory) {
    fun getDescription(): String {
        return "Номер товара: $id, название: $name, категория: ${category.getName()}"
    }
}