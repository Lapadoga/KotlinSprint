package org.example.lesson_8

fun main(){
    val ingredientArray = arrayOf("Молоко", "мука", "Яйца")

    println("Введите искомый ингредиент")
    val ingredientSearch = readln()

    for (i in ingredientArray){
        if (i.lowercase() == ingredientSearch.lowercase()){
            println("Ингредиент $ingredientSearch в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}