package org.example.lesson_22

fun main() {
    val house = House(30, 40, 50)

    val length = house.component1()
    val width = house.component2()
    val height = house.component3()

    println(length)
    println(width)
    println(height)
}

data class House(val length: Int, val width: Int, val height: Int)