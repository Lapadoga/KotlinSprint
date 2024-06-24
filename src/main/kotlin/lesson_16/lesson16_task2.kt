package org.example.lesson_16

import kotlin.math.pow

fun main() {
    val circle = Circle(1.0)

    println(circle.getArea())
    println(circle.getPerimeter())
}

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun getArea() = pi * radius.pow(2)
    fun getPerimeter() = 2 * pi * radius
}