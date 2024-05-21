package org.example.lesson_9

fun main() {
    val listOfIngredients = listOf("Молоко", "Яблоко", "Банан")

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach {
        println(it)
    }
}