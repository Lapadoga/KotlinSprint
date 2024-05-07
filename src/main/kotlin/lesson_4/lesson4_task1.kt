package org.example.lesson_4

const val AMOUNT_OF_TABLES = 13

fun main() {
    val reservedForToday = AMOUNT_OF_TABLES
    val freeForTomorrow = 4
    val reservedForTomorrow = AMOUNT_OF_TABLES - freeForTomorrow

    println("Доступность столиков на сегодня: ${reservedForToday < AMOUNT_OF_TABLES}\nДоступность столиков на завтра: ${reservedForTomorrow < AMOUNT_OF_TABLES}")
}