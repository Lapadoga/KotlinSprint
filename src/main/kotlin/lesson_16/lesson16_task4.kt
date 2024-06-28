package org.example.lesson_16

fun main() {
    val order = Order(1)
    order.sendRequest(true)
}

class Order(
    private val id: Int,
    private var isReady: Boolean = false,
) {
    private fun setStatus(newStatus: Boolean) {
        isReady = newStatus
    }

    fun sendRequest(newStatus: Boolean) {
        setStatus(newStatus)
        println("Заявка принята, текущий статус: заказ ${if (isReady) "готов" else "не готов"}")
    }
}