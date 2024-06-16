package org.example.lesson_14

fun main() {
    val linerShip = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    println(linerShip)
    println(cargoShip)
    println(icebreaker)
    icebreaker.crashIce()
}

open class Liner(
    val speed: Int = 60,
    val carrying: Int = 80,
    val amountOfPassengers: Int = 100,
) {
    override fun toString(): String {
        return "Скорость: $speed, вместимость: $carrying, количество перевозимых пассажиров: $amountOfPassengers"
    }
}

class Icebreaker(
    speed: Int = 30,
    carrying: Int = 80,
    amountOfPassengers: Int = 0,
) : Liner(speed, carrying, amountOfPassengers) {
    fun crashIce() {
        println("Колет лёд")
    }
}

class CargoShip(
    speed: Int = 30,
    carrying: Int = 100,
    amountOfPassengers: Int = 0,
) : Liner(speed, carrying, amountOfPassengers)