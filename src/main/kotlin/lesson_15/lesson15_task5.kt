package org.example.lesson_15

fun main() {
    val passengerVehicle1 = PassengerVehicle("Volvo")
    passengerVehicle1.boardPassengers(3)

    val passengerVehicle2 = PassengerVehicle("Opel")
    passengerVehicle2.boardPassengers(2)

    val cargoVehicle = CargoVehicle("Kamaz")
    cargoVehicle.boardPassengers(1)
    cargoVehicle.loadCargo(2000)

    passengerVehicle1.moveToDestination()
    passengerVehicle2.moveToDestination()
    cargoVehicle.moveToDestination()

    passengerVehicle1.unboardPassengers()
    passengerVehicle2.unboardPassengers()
    cargoVehicle.unboardPassengers()
    cargoVehicle.unloadCargo()
}

interface Cargo {
    val maxCargo: Int
    var amountOfCargo: Int
    fun loadCargo(amount: Int)
    fun unloadCargo()
}

interface Passenger {
    val maxPassengers: Int
    var amountOfPassengers: Int
    fun boardPassengers(amount: Int)
    fun unboardPassengers()
}

interface Movable {
    fun moveToDestination()
}

abstract class Vehicle(val name: String) : Movable, Passenger {
    override var amountOfPassengers = 0

    override fun boardPassengers(amount: Int) {
        if (amountOfPassengers + amount <= maxPassengers) {
            amountOfPassengers += amount
            println("$name. Текущее количество пассажиров: $amountOfPassengers")
        } else
            println("$name. Превышено максимальное количество пассажиров, посадка невозможна")
    }

    override fun unboardPassengers() {
        amountOfPassengers = 0
        println("$name. Пассажиры высажены")
    }

    override fun moveToDestination() {
        println("$name. Едет к месту назначения")
    }
}

class CargoVehicle(name: String) : Vehicle(name), Cargo {
    override val maxPassengers = 1
    override val maxCargo = 2000
    override var amountOfCargo = 0

    override fun loadCargo(amount: Int) {
        if (amountOfCargo + amount <= maxCargo) {
            amountOfCargo += amount
            println("$name. Текущее количество груза: $amountOfCargo")
        } else
            println("$name. Превышено максимальное количество груза, загрузка невозможна")
    }

    override fun unloadCargo() {
        amountOfCargo = 0
        println("$name. Груз выгружен")
    }
}

class PassengerVehicle(name: String) : Vehicle(name) {
    override val maxPassengers = 3
}