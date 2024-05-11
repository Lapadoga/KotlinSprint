package org.example.lesson_5

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    println("Введите свой логин")
    val userLogin = readln()

    if (userLogin == LOGIN) {
        println("Введите пароль пользователя $LOGIN")
        val userPassword = readln()
        if (userPassword == PASSWORD)
            println("Добро пожаловать!")
        else
            println("Вы ввели некорректный пароль")
    } else {
        println("Пользователь с данным логином не найден. Введите пароль для регистрации нового пользователя")
        val userPassword = readln()
        println("Пользователь успешно зарегистрирован. Добро пожаловать!")
    }
}