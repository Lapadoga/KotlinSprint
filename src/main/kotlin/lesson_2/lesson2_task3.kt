package org.example.lesson_2

fun main() {
    val departureHour: Byte = 9
    val departureMinute: Byte = 39
    val travelTime: Short = 457
    val minutesInDay: Short = 1440
    val minutesInHour: Byte = 60

    val departureTimeInMinutes = departureMinute + departureHour * minutesInHour
    val arrivalTimeInMinutes = (departureTimeInMinutes + travelTime) % minutesInDay
    val arrivalHour = arrivalTimeInMinutes / minutesInHour
    val arrivalMinute = arrivalTimeInMinutes % minutesInHour

    println("$arrivalHour:$arrivalMinute")
}