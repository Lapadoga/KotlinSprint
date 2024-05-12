package org.example.lesson_6

fun main() {
    println("Введите логин для регистрации")
    val login = readln()

    println("Введите пароль для регистрации")
    val password = readln()

    var isCorrect = false
    while (!isCorrect) {
        println("Введите логин")
        if (readln() != login) {
            println("Пользователь с данным логином не найден, повторите попытку")
            continue
        }
        println("Введите пароль")
        if (readln() != password) {
            println("Неправиольный пароль для логина $login, повторите ввод данных заново")
            continue
        }
        println("Авторизация прошла успешно")
        isCorrect = true
    }
}