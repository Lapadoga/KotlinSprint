package org.example.lesson_14

fun main() {
    val liner = Liner1()
    val icebreaker = Icebreaker1()
    val cargoShip = CargoShip1()

    liner.print()
    liner.load()
    println("-----------------------")

    icebreaker.print()
    icebreaker.load()
    println("-----------------------")

    cargoShip.print()
    cargoShip.load()
}

open class Liner1(
    val speed: Int = 60,
    val carrying: Int = 80,
    val amountOfPassengers: Int = 100,
    val typeOfShip: String = "Лайнер",
) {
    fun print() {
        println("Тип корабля: $typeOfShip, скорость: $speed, вместимость: $carrying, количество перевозимых пассажиров: $amountOfPassengers")
    }

    open fun load() {
        println("Выдвинут горизонтальный трап со шкафута")
    }
}

class Icebreaker1(
    speed: Int = 30,
    carrying: Int = 40,
    amountOfPassengers: Int = 0,
    typeOfShip: String = "Ледокол",
) : Liner1(speed, carrying, amountOfPassengers, typeOfShip) {
    fun crashIce() {
        println("Колет лёд")
    }

    override fun load() {
        println("Открыты ворота со стороны кормы")
    }
}

class CargoShip1(
    speed: Int = 30,
    carrying: Int = 100,
    amountOfPassengers: Int = 0,
    typeOfShip: String = "Грузовой",
) : Liner1(speed, carrying, amountOfPassengers, typeOfShip) {
    override fun load() {
        println("Активирован погрузочный кран")
    }
}