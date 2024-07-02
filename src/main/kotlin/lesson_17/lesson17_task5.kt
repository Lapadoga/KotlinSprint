package org.example.lesson_17

fun main() {
    val user = User("log", "pass")

    user.login = "Login"
    println(user.login)
    user.password = "123"
    println(user.password)
}

class User(userLogin: String, userPassword: String) {
    var login = userLogin
        set(value) {
            if (value.isEmpty())
                println("Нельзя устанавливать пустой логин")
            else {
                field = value
                println("Логин успешно изменен")
            }
        }

    var password = userPassword
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() {
            val charArray = CharArray(field.length) { '*' }
            return charArray.joinToString("")
        }
}