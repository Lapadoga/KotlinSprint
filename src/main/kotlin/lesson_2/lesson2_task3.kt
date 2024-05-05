package org.example.lesson_2

fun main() {
    val departureString = "9:39"
    val departureStringParts = departureString.split(':')
    val departureHour: Byte = departureStringParts[0].toByte()
    val departureMinute: Byte = departureStringParts[1].toByte()
    val travelTime: Short = 457
    val minutesInHour: Byte = 60
    val hourInDay: Byte = 24
    val minutesInDay = hourInDay * minutesInHour

    val departureTimeInMinutes = departureMinute + departureHour * minutesInHour
    val arrivalTimeInMinutes = (departureTimeInMinutes + travelTime) % minutesInDay
    val arrivalHour = arrivalTimeInMinutes / minutesInHour
    val arrivalMinute = arrivalTimeInMinutes % minutesInHour

    println("$arrivalHour:$arrivalMinute")
}