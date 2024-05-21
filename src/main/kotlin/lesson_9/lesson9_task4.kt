package org.example.lesson_9

fun main() {
    println("Введите пять ингредиентов через запятую")
    val ingredientsString = readln()

    val ingredientsList = ingredientsString.split(", ")
    val sortedList = ingredientsList.sorted()
    println("Список ингредиентов:")
    sortedList.forEach { println(it) }
}