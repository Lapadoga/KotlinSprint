package org.example.lesson_9

const val AMOUNT_OF_INGREDIENTS = 5

fun main() {
    val range = 0 until AMOUNT_OF_INGREDIENTS
    val setOfIngredients = sortedSetOf<String>()

    println("Введите пять ингредиентов")
    for (i in range)
        setOfIngredients.add(readln())

    val ingredientsString = setOfIngredients.joinToString(", ")
    println(ingredientsString.replaceFirst(ingredientsString[0], ingredientsString[0].uppercaseChar()))
}