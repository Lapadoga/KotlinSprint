package org.example.lesson_10

const val RANDOM_RANGE_FROM = 1
const val RANDOM_RANGE_UNTIL = 6

fun main() {
    val randomRange = RANDOM_RANGE_FROM..RANDOM_RANGE_UNTIL
    var gameMode: Int

    do {
        val playerRoll = diceRoll(randomRange)
        println("Ход игрока. Игрок выбросил $playerRoll")

        val botRoll = diceRoll(randomRange)
        println("Ход компьютера. Компьютер выбросил $botRoll")

        when {
            playerRoll > botRoll -> println("Победило человечество")
            playerRoll < botRoll -> println("Победила машина")
            else -> println("Ничья")
        }

        println(
            """
            1. Продолжить
            0. Выйти
        """.trimIndent()
        )
        gameMode = readln().toInt()
    } while (gameMode == 1)
}

fun diceRoll(range: IntRange) = range.random()