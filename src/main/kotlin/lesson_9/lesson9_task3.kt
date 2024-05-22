package org.example.lesson_9

fun main() {
    val amountOfIngredientsList = mutableListOf(2, 50, 15)

    println("Введите количество порций")
    val amountOfServings = readln().toInt()
    amountOfIngredientsList.forEachIndexed { index, _ ->
        amountOfIngredientsList[index] *= amountOfServings
    }

    val servingString = if (amountOfServings == 1) "порции" else "порций"
    val ingredientsString = "Яиц - ${amountOfIngredientsList[0]}, молока - ${amountOfIngredientsList[1]}, " +
            "сливочного масла - ${amountOfIngredientsList[2]}"
    println("Для $amountOfServings $servingString вам понадобится: $ingredientsString")
}