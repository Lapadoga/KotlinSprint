package org.example.lesson_16

fun main() {
    val dice = Dice()
    println(dice.getValue())
}

class Dice {
    private val randomRange = 1..6
    private val value = randomRange.random()

    fun getValue() = value
}