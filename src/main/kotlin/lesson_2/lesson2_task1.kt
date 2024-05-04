package org.example.lesson_2

fun main() {
    val amountOfStudents = 4f
    val grade1 = 3f
    val grade2 = 4f
    val grade3 = 3f
    val grade4 = 5f

    val average = (grade1 + grade2 + grade3 + grade4) / amountOfStudents

    println(String.format("%,.2f", average))
}