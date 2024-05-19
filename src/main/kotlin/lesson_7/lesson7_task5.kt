package org.example.lesson_7

const val MIN_PASSWORD_LENGTH = 6

fun main() {
    val numberRange = '1'..'9'
    val charRange = 'a'..'z'
    val capitalCharRange = 'A'..'Z'
    val randomRange = numberRange + charRange + capitalCharRange
    val password = mutableListOf<Char>()

    println("Введите длину пароля, она должна быть больше ${MIN_PASSWORD_LENGTH - 1}")
    var passwordLength = readln().toInt()
    while (passwordLength < MIN_PASSWORD_LENGTH) {
        println("Длина пароля меньше минимальной, введите длину больше ${MIN_PASSWORD_LENGTH - 1}")
        passwordLength = readln().toInt()
    }

    password.add(numberRange.random())
    password.add(charRange.random())
    password.add(capitalCharRange.random())

    val indexStart = 3
    for (i in indexStart until passwordLength) {
        password.add(randomRange.random())
    }
    password.shuffle()

    for (i in password)
        print(i)
}