package org.example.lesson_7

const val MIN_PASSWORD_LENGTH = 6

fun main() {
    val numberRange = 0..9
    val charRange = 'a'..'z'
    val capitalCharRange = 'A'..'Z'
    val indexRange = 1..3
    var password = ""

    println("Введите длину пароля, она должна быть больше ${MIN_PASSWORD_LENGTH - 1}")
    var passwordLength = readln().toInt()
    while (passwordLength < MIN_PASSWORD_LENGTH) {
        println("Длина пароля меньше минимальной, введите длину больше ${MIN_PASSWORD_LENGTH - 1}")
        passwordLength = readln().toInt()
    }

    for (i in 0 until passwordLength) {
        val randomIndex = indexRange.random()
        password += when (randomIndex) {
            1 -> numberRange.random()
            2 -> charRange.random()
            else -> capitalCharRange.random()
        }
    }
    println(password)
}