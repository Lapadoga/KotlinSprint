package org.example.lesson_10

const val PASSWORD_RANGE_NUMBER_FROM = '0'
const val PASSWORD_RANGE_NUMBER_UNTIL = '9'
const val PASSWORD_RANGE_SYMBOL_FROM = ' '
const val PASSWORD_RANGE_SYMBOL_UNTIL = '/'

fun main() {
    println("Введите длину пароля")
    val passwordLength = readln().toInt()

    val generatedPassword = generatePassword(passwordLength)
    println("Ваш пароль: $generatedPassword")
}

fun generatePassword(length: Int): String {
    val numberRange = PASSWORD_RANGE_NUMBER_FROM..PASSWORD_RANGE_NUMBER_UNTIL
    val symbolRange = PASSWORD_RANGE_SYMBOL_FROM..PASSWORD_RANGE_SYMBOL_UNTIL
    val cycleRange = 0 until length
    var password = ""

    for (i in cycleRange) {
        password += if (i % 2 == 0) numberRange.random() else symbolRange.random()
    }

    return password
}
