package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов, затем ингредиенты")
    val ingredientsArray = Array(readln().toInt()) { readln() }

    println("Введенные ингредиенты: ${ingredientsArray.joinToString(", ")}")
}