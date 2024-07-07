package org.example.lesson_22

fun main() {
    val regBook = RegularBook1("Book", "Author")
    val dataBook = DataBook1("Book", "Author")

    println(regBook)
    println(dataBook)

//    Разница в выводе объясняется тем, что непереопределенный метод toString в обычных классах выводит имя класса и
//    хеш код объекта, а в data классах выводится имя класса и значения свойств
}

class RegularBook1(val name: String, val author: String)

data class DataBook1(val name: String, val author: String)