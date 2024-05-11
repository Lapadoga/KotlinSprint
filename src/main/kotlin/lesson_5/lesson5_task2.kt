package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = LocalDate.now().year

    println("Введите год своего рождения")
    val userYear = readln().toInt()

    if (currentYear - userYear >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Вернуться на главный экран")
}