package org.example.lesson_10

const val USER_LOGIN = "login"
const val USER_PASSWORD = "password"
const val TOKEN_LENGTH = 32

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    val userToken = userAuth(login, password)
    if (userToken == null)
        println("Ошибка авторизации")
    else {
        println(userToken)
        val shoppingCart = getShoppingCart(userToken)
        println("Содержимое вашей корзины: ${shoppingCart.joinToString(", ")}")
    }
}

fun userAuth(login: String, password: String): String? {
    if (login != USER_LOGIN || password != USER_PASSWORD)
        return null

    val numberRange = '1'..'9'
    val charRange = 'a'..'z'
    val capitalCharRange = 'A'..'Z'
    val randomRange = numberRange + charRange + capitalCharRange
    val cycleRange = 0 until TOKEN_LENGTH
    var token = ""

    for (i in cycleRange)
        token += randomRange.random()

    return token
}

fun getShoppingCart(token: String?): MutableList<String> = mutableListOf("Кресло", "Диван")