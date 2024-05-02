package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    val hourString: String = String.format("%02d", hour)
    val minuteString: String = String.format("%02d", minute)

    println("$year")
    println(hourString)
    println(minuteString)

    hour = 10
    minute = 55

    print("Время посадки: ")
    print(hour)
    print(':')
    print(minute)
}