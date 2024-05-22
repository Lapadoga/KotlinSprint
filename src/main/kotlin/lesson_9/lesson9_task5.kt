package org.example.lesson_9

const val AMOUNT_OF_INGREDIENTS = 5

fun main() {
    val range = 0 until AMOUNT_OF_INGREDIENTS
    val setOfIngredients = mutableSetOf<String>()

    println("Введите пять ингредиентов")
    for (i in range)
        setOfIngredients.add(readln())

    val sortedIngredientsList = setOfIngredients.sorted()
    val ingredientsString = sortedIngredientsList.joinToString(", ")
    ingredientsString.forEachIndexed { index, c ->
        if (index == 0)
            print(c.uppercaseChar())
        else
            print(c)
    }
}