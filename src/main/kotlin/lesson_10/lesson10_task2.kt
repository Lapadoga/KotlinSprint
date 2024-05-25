package org.example.lesson_10

const val MIN_LENGTH = 4

fun main() {
    println("Введите логин")
    val login = readln()

    println("Введите пароль")
    val password = readln()

    if (!isValidData(login) || !isValidData(password))
        println("Логин или пароль недостаточно длинные")
    else
        println("Данные прошли проверку")
}

fun isValidData(data: String) = data.length >= MIN_LENGTH