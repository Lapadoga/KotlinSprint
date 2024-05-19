package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов")
    val amountOfIngredients = readln().toInt()
    if (amountOfIngredients == 0)
        return
    val ingredientsArray = Array(amountOfIngredients) { " " }

    println("Введите ингредиенты")
    for (i in ingredientsArray.indices)
        ingredientsArray[i] = readln()

    println("Введенные ингредиенты: ${ingredientsArray.joinToString(", ")}")
}