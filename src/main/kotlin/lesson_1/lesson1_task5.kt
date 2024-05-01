package org.example.lesson_1

fun main() {
    val seconds: Short = 6480
    val amountOfMinutes = seconds / 60
    val remainderOfSeconds = seconds - amountOfMinutes * 60
    val amountOfHour = amountOfMinutes / 60
    val remainderOfMinutes = amountOfMinutes - amountOfHour * 60

    println("${String.format("%02d", amountOfHour)}:${String.format("%02d",remainderOfMinutes)}:${String.format("%02d",remainderOfSeconds)}")

}