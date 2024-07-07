package org.example.lesson_21

fun main() {
    val listOfInt = listOf(1, 10, 500, 432)
    println(listOfInt.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Long {
    var counter = 0L
    this.forEach {
        if (it % 2 == 0)
            counter += it
    }
    return counter
}