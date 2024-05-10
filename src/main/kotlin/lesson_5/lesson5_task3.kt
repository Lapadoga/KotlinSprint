package org.example.lesson_5

import kotlin.random.Random

const val NUMBER_FROM = 0
const val NUMBER_UNTIL = 42

fun main() {
    val number1 = Random.nextInt(NUMBER_FROM, NUMBER_UNTIL)
    val number2 = Random.nextInt(NUMBER_FROM, NUMBER_UNTIL)

    println("Введите два целых числа в диапазоне от $NUMBER_FROM до $NUMBER_UNTIL")
    val answer1 = readln().toInt()
    val answer2 = readln().toInt()

    val winCondition = (answer1 == number1) && (answer2 == number2) || (answer1 == number2) && (answer2 == number1)
    val consolationCondition =
        (answer1 == number1) || (answer1 == number2) || (answer2 == number1) || (answer2 == number2)

    when {
        winCondition -> println("Поздравляем! Вы выиграли главный приз!")
        consolationCondition -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }
    println("Выигрышные числа: $number1, $number2")
}