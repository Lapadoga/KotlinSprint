package org.example.lesson_11

fun main() {
    val user = User2(1, "log1", "pass1", "user1@gmail.com")

    println("Введите информацию о себе")
    user.setBio()

    println("Процедура смены пароля")
    user.setPassword()

    user.print()
}

class User2(
    private val id: Int,
    private val login: String,
    private var password: String,
    private val email: String,
    private var bio: String = "",
) {
    fun print() {
        println(
            """
            Информация о пользователе:
            ID: $id
            Login: $login
            Password: $password
            Email: $email
            Bio: $bio
        """.trimIndent()
        )
    }

    fun setBio() {
        bio = readln()
    }

    fun setPassword() {
        println("Введите текущий пароль")
        val curPassword = readln()

        if (curPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Пароль успешно изменен")
        } else
            println("Пароль введен неверно")
    }
}