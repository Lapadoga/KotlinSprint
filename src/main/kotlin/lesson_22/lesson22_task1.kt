package org.example.lesson_22

fun main() {
    val regBook1 = RegularBook("Book", "Author")
    val dataBook1 = DataBook("Book", "Author")
    val regBook2 = RegularBook("Book", "Author")
    val dataBook2 = DataBook("Book", "Author")

    println(dataBook1 == dataBook2)
    println(regBook1 == regBook2)

//    Так как непереопределенный метод equals в обычных классах сравнивает ссылки на экземпляры, а не значения свойств, то
//    при их сравнении получаем false. В data классах же сравнение происходит по значениям свойств, поэтому получаем true
}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)