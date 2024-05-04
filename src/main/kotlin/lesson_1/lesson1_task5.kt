package org.example.lesson_1

fun main() {
    val unitOfTime: Byte = 60

    val seconds: Short = 6480
    val amountOfMinutes = seconds / unitOfTime
    val remainderOfSeconds = seconds - amountOfMinutes * unitOfTime
    val amountOfHour = amountOfMinutes / unitOfTime
    val remainderOfMinutes = amountOfMinutes - amountOfHour * unitOfTime

    println(String.format("%02d:%02d:%02d", amountOfHour, remainderOfMinutes, remainderOfSeconds))
}