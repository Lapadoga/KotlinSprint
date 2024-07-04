package org.example.lesson_18

fun main() {
    val cat = Cat("Машка")
    val dog = Dog("Шарик")
    val fox = Fox("Алиса")

    val listOfAnimals = listOf<Animal>(cat, dog, fox)
    listOfAnimals.forEach {
        it.eat()
    }
}

abstract class Animal(val name: String) {
    abstract fun eat()
    fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}