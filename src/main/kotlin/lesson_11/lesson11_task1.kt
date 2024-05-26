package org.example.lesson_11

fun main() {
    val user1 = User(1, "log1", "pass1", "user1@gmail.com")
    val user2 = User(2, "log2", "pass2", "user2@gmail.com")

    println(
        """
        Данные о первом пользователе:
        Id: ${user1.id}
        Login: ${user1.login}
        Password: ${user1.password}
        Email: ${user1.email}
        ---------------------------------------------
        Данные о втором пользователе:
        Id: ${user2.id}
        Login: ${user2.login}
        Password: ${user2.password}
        Email: ${user2.email}
    """.trimIndent()
    )
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)