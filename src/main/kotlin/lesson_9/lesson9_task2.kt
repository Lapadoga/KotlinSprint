package org.example.lesson_9

fun main() {
    val ingredientsList = mutableListOf("Мука", "Яйца", "Молоко")

    println("В рецепте есть базовые ингредиенты: ${ingredientsList.joinToString(", ")}")

    println("Желаете добавить еще?")
    if (readln() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        ingredientsList.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${ingredientsList.joinToString(", ")}")
    }
}