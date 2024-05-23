package org.example.lesson_10

const val RANDOM_RANGE_FROM = 1
const val RANDOM_RANGE_UNTIL = 6
const val USER_ID = 1
const val BOT_ID = 2

fun main() {
    val randomRange = RANDOM_RANGE_FROM..RANDOM_RANGE_UNTIL
    var userWins = 0
    var botWins = 0

    do {
        when (playRound(randomRange)) {
            USER_ID -> userWins++
            BOT_ID -> botWins++
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userAnswer = readln()
    } while (userAnswer.equals("Да", true))

    when {
        userWins > botWins -> println("Победило человечество")
        userWins < botWins -> println("Победил компьютер")
        else -> println("Ничья")
    }
}

fun diceRoll(range: IntRange) = range.random()

fun playRound(randomRange: IntRange): Int {
    val playerRoll = diceRoll(randomRange)
    println("Ход игрока. Игрок выбросил $playerRoll")

    val botRoll = diceRoll(randomRange)
    println("Ход компьютера. Компьютер выбросил $botRoll")

    val winID = when {
        playerRoll > botRoll -> {
            println("Раунд за игроком")
            USER_ID
        }

        playerRoll < botRoll -> {
            println("Раунд за компьютером")
            BOT_ID
        }

        else -> {
            println("Раунд в ничью")
            0
        }
    }

    return winID
}

