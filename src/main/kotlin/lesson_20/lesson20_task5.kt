package org.example.lesson_20

fun main() {
    val modifier: (String) -> String = { it.reversed() }
    val phrases = listOf("Привет", "Пока", "Как дела?", "Хорошая погода", "Доброе утро")

    val robot = Robot(phrases)
    robot.say()
    robot.setModifier(modifier)
    robot.say()
}

class Robot(private val listOfPhrases: List<String>) {
    private var currentModifier: ((String) -> String)? = null

    fun say() {
        val phrase = listOfPhrases.random()
        if (currentModifier == null)
            println(phrase)
        else
            println(currentModifier?.invoke(phrase))
    }

    fun setModifier(modifier: (String) -> String) {
        currentModifier = modifier
    }
}