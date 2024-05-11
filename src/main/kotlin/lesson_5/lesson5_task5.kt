package org.example.lesson_5

import kotlin.random.Random

const val NUMBER_FROM = 0
const val NUMBER_UNTIL = 42
const val AMOUNT_OF_NUMBERS = 3

fun main() {
    val startIndex = 0
    val range = startIndex until AMOUNT_OF_NUMBERS
    val numberList = mutableListOf<Int>()

    for (i in range)
        numberList.add(Random.nextInt(NUMBER_FROM, NUMBER_UNTIL))

    val answerList = mutableListOf<Int>()
    println("Введите три целых числа в диапазоне от $NUMBER_FROM до $NUMBER_UNTIL")
    for (i in range)
        answerList.add(readln().toInt())

    val amountOfGuessedNumbers = numberList.intersect(answerList.toSet()).size

    when (amountOfGuessedNumbers) {
        3 -> println("Угаданы все числа, вы выиграли джекпот!")
        2 -> println("Угаданы два числа, вы выиграли крупный приз!")
        1 -> println("Угадано одно число, вы выиграли утешительный приз!")
        else -> println("Ни одно число не угадано")
    }
    println("Выигрышные числа: $numberList")
}