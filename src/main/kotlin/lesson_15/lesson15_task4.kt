package org.example.lesson_15

abstract class Product(val name: String, val amount: Int)

interface Searchable {
    fun searchForComponent()
}

class Component(name: String, amount: Int) : Product(name, amount)

class Instrument(name: String, amount: Int) : Product(name, amount), Searchable {
    override fun searchForComponent() {
        println("Выполняется поиск")
    }
}