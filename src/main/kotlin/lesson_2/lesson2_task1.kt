package org.example.lesson_2

fun main() {
    val amountOfStudents: Byte = 4
    val grade1: Byte = 3
    val grade2: Byte = 4
    val grade3: Byte = 3
    val grade4: Byte = 5

    val average = (grade1 + grade2 + grade3 + grade4).toFloat() / amountOfStudents

    println(String.format("%,.2f", average))
}