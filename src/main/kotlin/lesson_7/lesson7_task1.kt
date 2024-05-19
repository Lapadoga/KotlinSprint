package org.example.lesson_7

const val PASSWORD_LENGTH = 6

fun main() {
    val cycleRange = 1..PASSWORD_LENGTH
    val charRange = 'a'..'z'
    val numberRange = 1..9
    var password = ""

    for (i in cycleRange) {
        val passwordPart = if (i % 2 == 0) numberRange.random() else charRange.random()
        password += passwordPart
    }

    println(password)
}