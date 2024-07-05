package org.example.lesson_18

import kotlin.math.pow

abstract class Package {
    abstract fun getSquare(): Double
}

class RectangularPackage(val width: Double, val length: Double, val height: Double) : Package() {
    override fun getSquare(): Double {
        return 2 * (width * length + length * height + width * height)
    }
}

class CubicPackage(val edge: Double) : Package() {
    override fun getSquare(): Double {
        return 6 * edge.pow(2)
    }
}
