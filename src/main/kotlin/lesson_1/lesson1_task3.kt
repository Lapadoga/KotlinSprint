package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    var hourString: String = String.format("%02d", hour)
    var minuteString: String = String.format("%02d", minute)

    println(year)
    println(hourString)
    println(minuteString)

    hour = 10
    minute = 55

    hourString = String.format("%02d", hour)
    minuteString = String.format("%02d", minute)

    print("Время посадки: ")
    print(hourString)
    print(':')
    print(minuteString)
}