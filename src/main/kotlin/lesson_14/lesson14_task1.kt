package org.example.lesson_14

fun main() {
    val linerShip = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    println(linerShip)
    println(cargoShip)
    println(icebreaker)
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
    val canCrashIce: Boolean = true,
) : Liner(speed, carrying, amountOfPassengers) {
    override fun toString(): String {
        return super.toString() + ", может колоть лёд: ${if (canCrashIce) "Да" else "Нет"}"
    }
}

class CargoShip(
    speed: Int = 30,
    carrying: Int = 100,
    amountOfPassengers: Int = 0,
) : Liner(speed, carrying, amountOfPassengers)