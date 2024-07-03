package org.example.lesson_18

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    val listOfDices = listOf<Dice>(dice4, dice6, dice8)
    listOfDices.forEach {
        println(it.rollDice())
    }
}

open class Dice {
    protected open val numberOfFaces = 0

    open fun rollDice() = 0
}

class Dice4 : Dice() {
    override val numberOfFaces = 4

    override fun rollDice(): Int {
        return (1..numberOfFaces).random()
    }
}

class Dice6 : Dice() {
    override val numberOfFaces = 6

    override fun rollDice(): Int {
        return (1..numberOfFaces).random()
    }
}

class Dice8 : Dice() {
    override val numberOfFaces = 8

    override fun rollDice(): Int {
        return (1..numberOfFaces).random()
    }
}