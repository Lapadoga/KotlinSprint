package org.example.lesson_18

fun main() {
    val order1 = Order()
    val order2 = Order()

    order1.getOrderInfo(1, "Клавиатура")
    order2.getOrderInfo(2, listOf("Мышь, Тряпочка, Монитор"))
}

class Order {
    fun getOrderInfo(number: Int, goods: String) {
        println("Заказан товар: $goods")
    }

    fun getOrderInfo(number: Int, goodsList: List<String>) {
        println("Заказаны следующие товары: ${goodsList.joinToString(", ")}")
    }
}