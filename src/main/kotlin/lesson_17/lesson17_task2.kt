package org.example.lesson_17

fun main() {
    val ship = Ship("Test", 10, "Port")

    ship.name = "Ship"
    println(ship.name)
}

class Ship(shipName: String, var speed: Byte, var port: String) {
    var name = shipName
        set(value) {
            println("Запрещено менять имя корабля")
        }
}