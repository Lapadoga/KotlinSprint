package org.example.lesson_18

fun main() {
    val dot = Dot("Черный")
    val square = Square("Белый")
    val circle = Circle("Красный")
    val screen = Screen()

    screen.draw(square, 1, 2)
    screen.draw(dot, 2.5f, 1.9f)
    screen.draw(circle, 5f, 6.5f)
}

abstract class Figure(val color: String)
class Circle(color: String) : Figure(color)
class Square(color: String) : Figure(color)
class Dot(color: String) : Figure(color)

class Screen {
    fun draw(figure: Figure, x: Int, y: Int) {
        val figureType = when (figure::class) {
            Circle::class -> "круг"
            Square::class -> "квадрат"
            else -> "точка"
        }
        println("Объект $figureType, цвет ${figure.color}, изображен в точке [$x, $y]")
    }

    fun draw(figure: Figure, x: Float, y: Float) {
        val figureType = when (figure::class) {
            Circle::class -> "круг"
            Square::class -> "квадрат"
            else -> "точка"
        }
        println("Объект $figureType, цвет ${figure.color}, изображен в точке [$x, $y]")
    }
}