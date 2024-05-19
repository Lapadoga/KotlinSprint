package org.example.lesson_8

fun main() {
    val ingredientArray = arrayOf("Молоко", "Мука", "Яйца")

    println("Введите искомый ингредиент")
    val ingredientSearch = readln()

    val indexSearch = ingredientArray.indexOf(ingredientSearch)
    if (indexSearch == -1)
        println("Такого ингредиента в рецепте нет")
    else
        println("Ингредиент $ingredientSearch в рецепте есть")
}