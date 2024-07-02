package org.example.lesson_17

fun main() {
    val pack = Package("123", "Воронеж")
    println(pack.replaceCounter)

    pack.currentPlace = "Москва"
    println(pack.replaceCounter)
}

class Package(val id: String, place: String) {
    var replaceCounter = 0
    var currentPlace = place
        set(value) {
            field = value
            replaceCounter++
        }
}