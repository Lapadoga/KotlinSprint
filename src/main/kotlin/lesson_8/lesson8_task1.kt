package org.example.lesson_8

fun main() {
    val mondayViews = 200
    val tuesdayViews = 150
    val wednesdayViews = 300
    val thursdayViews = 400
    val fridayViews = 100
    val saturdayViews = 500
    val sundayViews = 200
    val viewsArray =
        intArrayOf(mondayViews, tuesdayViews, wednesdayViews, thursdayViews, fridayViews, saturdayViews, sundayViews)

    println("Количество просмотров: ${viewsArray.sum()}")
}