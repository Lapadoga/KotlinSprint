package org.example.lesson_22

fun main() {
    val house = House(30, 40, 50)

    val (length, width, height) = house

    println(length)
    println(width)
    println(height)
}

data class House(val length: Int, val width: Int, val height: Int)