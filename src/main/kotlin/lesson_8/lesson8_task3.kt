package org.example.lesson_8

fun main() {
    val ingredientArray = arrayOf("Молоко", "Мука", "Яйца")

    println("Введите искомый ингредиент")
    val ingredientSearch = readln()

    if (ingredientSearch in ingredientArray)
        println("Ингредиент $ingredientSearch в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")
}