package org.example.lesson_6

import kotlin.random.Random

const val AMOUNT_OF_TRIES = 3
const val NUMBER_FROM = 1
const val NUMBER_UNTIL = 9

fun main() {
    var isHuman = false
    var currentTry = 1

    while (currentTry <= AMOUNT_OF_TRIES && !isHuman) {
        val number1 = Random.nextInt(NUMBER_FROM, NUMBER_UNTIL)
        val number2 = Random.nextInt(NUMBER_FROM, NUMBER_UNTIL)

        println("Чтобы подтвердить, что вы человек, введите сумму чисел $number1 и $number2")
        if (readln().toInt() == number1 + number2) {
            isHuman = true
            println("Добро пожаловать!")
        } else {
            println("Неверно. Количество оставшихся попыток: ${AMOUNT_OF_TRIES - currentTry}")
            currentTry++
        }
    }

    if (!isHuman)
        println("Доступ запрещен")
}