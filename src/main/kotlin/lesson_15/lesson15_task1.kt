package org.example.lesson_15

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.swim()
    seagull.fly()
    duck.swim()
    duck.fly()
}

interface WaterMovable {
    fun swim()
}

interface AirMovable {
    fun fly()
}

class Crucian() : WaterMovable {
    override fun swim() {
        println("Карась плавает под водой")
    }
}

class Seagull() : AirMovable {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck() : AirMovable, WaterMovable {
    override fun fly() {
        println("Утка летает")
    }

    override fun swim() {
        println("Утка плавает по воде")
    }
}