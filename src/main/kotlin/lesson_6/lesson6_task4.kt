package org.example.lesson_6

import kotlin.random.Random

const val AMOUNT_OF_TRIES = 5
const val NUMBER_FROM = 1
const val NUMBER_UNTIL = 9

fun main() {
    val hiddenNumber = Random.nextInt(NUMBER_FROM, NUMBER_UNTIL)
    var currentTry = 1
    var isGuessed = false
    var userNumber: Int

    while (currentTry <= AMOUNT_OF_TRIES && !isGuessed) {
        println("Введите целое число в диапазоне от $NUMBER_FROM до $NUMBER_UNTIL")
        userNumber = readln().toInt()
        if (userNumber == hiddenNumber) {
            println("Это была великолепная игра!")
            isGuessed = true
        } else {
            println("Неверно. Оставшееся количество попыток: ${AMOUNT_OF_TRIES - currentTry}")
            currentTry++
        }
    }

    if (!isGuessed)
        println("Было загадано число $hiddenNumber")
}