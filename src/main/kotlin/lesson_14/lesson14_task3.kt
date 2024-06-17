package org.example.lesson_14

const val PI = 3.14

fun main() {
    val round1 = Round("Черный", 2.0)
    val round2 = Round("Черный", 3.4)
    val round3 = Round("Белый", 1.0)

    val rectangle1 = Rectangle("Белый", 0.5, 1.0)
    val rectangle2 = Rectangle("Белый", 4.0, 2.0)
    val rectangle3 = Rectangle("Черный", 2.0, 5.5)

    val figureList = listOf(round1, round2, round3, rectangle3, rectangle2, rectangle1)
    var blackPerimeterSum = 0.0
    var whiteSquareSum = 0.0

    figureList.forEach {
        if (it.color.equals("Черный", true))
            blackPerimeterSum += it.getPerimeter()
        else
            whiteSquareSum += it.getSquare()
    }

    println("Сумма периметров черных фигур: $blackPerimeterSum, сумма площадей белых фигур: $whiteSquareSum")
}

abstract class Figure(
    val color: String,
) {
    abstract fun getSquare(): Double
    abstract fun getPerimeter(): Double
}

class Round(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun getSquare(): Double {
        return PI * radius.times(2)
    }

    override fun getPerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    val height: Double,
    val width: Double,
) : Figure(color) {
    override fun getSquare(): Double {
        return height * width
    }

    override fun getPerimeter(): Double {
        return 2 * (height + width)
    }
}