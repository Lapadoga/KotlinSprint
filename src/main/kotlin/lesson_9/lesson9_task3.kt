package org.example.lesson_9

fun main() {
    val amountOfIngredientsList = mutableListOf(2, 50, 15)

    println("Введите количество порций")
    val amountOfServings = readln().toInt()
    val servingsList = amountOfIngredientsList.map {
        it * amountOfServings
    }

    val servingString = if (amountOfServings == 1) "порции" else "порций"
    val ingredientsString = "Яиц - ${servingsList[0]}, молока - ${servingsList[1]}, " +
            "сливочного масла - ${servingsList[2]}"
    println("Для $amountOfServings $servingString вам понадобится: $ingredientsString")
}