package org.example.lesson_20

fun main() {
    val pressElement = { element: String -> println("Нажат элемент $element") }
    val listOfString = listOf("Выход", "Ок", "Закрыть", "Логин")
    val listOfLambda = listOfString.map {
        if ((listOfString.indexOf(it) + 1) % 2 == 0)
            pressElement(it)
    }
}