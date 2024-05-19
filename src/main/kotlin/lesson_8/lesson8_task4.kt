package org.example.lesson_8

fun main() {
    val ingredientArray = arrayOf("Молоко", "Мука", "Яйца")
    println("Текущий список ингредиентов: ${ingredientArray.joinToString(", ")}")

    println("Введите заменяемый ингредиент")
    val ingredientSearch = readln()

    val ingredientIndex = ingredientArray.indexOf(ingredientSearch)
    if (ingredientIndex == -1) {
        println("Такого ингредиента нет")
        return
    }

    println("Введите добавляемый ингредиент")
    val newIngredient = readln()
    ingredientArray[ingredientIndex] = newIngredient
    println("Готово! Вы сохранили следующий список: ${ingredientArray.joinToString(", ")}")
}