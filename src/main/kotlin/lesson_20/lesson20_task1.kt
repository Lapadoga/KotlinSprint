package org.example.lesson_20

fun main() {
    val printGreetings: (String) -> Unit = { username: String -> println("С наступающим Новым Годом, $username!") }

    println("Введите имя пользователя")
    val user = readln()
    printGreetings(user)
}
