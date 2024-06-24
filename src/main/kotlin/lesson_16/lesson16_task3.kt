package org.example.lesson_16

fun main() {
    val user = User()

    println("Введите пароль")
    val password = readln()
    val checkResult = user.isValidPassword(password)
    if (checkResult)
        println("Верный пароль")
    else
        println("Неверный пароль")
}

class User {
    private val login = "Test"
    private val password = "Pass"

    fun isValidPassword(checkString: String) = checkString == password
}