package org.example.lesson_7

const val CODE_FROM = 1000
const val CODE_UNTIL = 9999

fun main() {
    val codeRange = CODE_FROM..CODE_UNTIL

    do {
        val newCode = codeRange.random()
        println("Ваш код авторизации: $newCode")

        println("Введите код авторизации")
        val input = readln().toInt()
        if (input == newCode) {
            println("Добро пожаловать!")
        }
    } while (input != newCode)
}