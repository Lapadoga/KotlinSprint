package org.example.lesson_10

const val USER_LOGIN = "login"
const val USER_PASSWORD = "password"
const val TOKEN_LENGTH = 32

fun main() {
    val login = getDataFromUser("Введите логин")
    val password = getDataFromUser("Введите пароль")

    val isAuthorized = userAuth(login, password)
    val generatedToken = generateToken(isAuthorized)
    if (generatedToken == null)
        println("Ошибка авторизации")
    else {
        val shoppingCart = getShoppingCart(generatedToken)
        println("Содержимое вашей корзины: ${shoppingCart.joinToString(", ")}")
    }
}

fun userAuth(login: String, password: String): Boolean = login == USER_LOGIN && password == USER_PASSWORD

fun generateToken(isAuthorized: Boolean): String? {
    if (!isAuthorized)
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

fun getDataFromUser(message: String): String {
    println(message)

    return readln()
}