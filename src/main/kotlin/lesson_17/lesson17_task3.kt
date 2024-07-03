package org.example.lesson_17

fun main() {
    val folder = Folder("folder1", 10, true)
    println(folder.name)
    println(folder.numberOfFiles)
}

class Folder(folderName: String, numberOfFiles_: Int, private var isSecret: Boolean) {
    val name = folderName
        get() = if (isSecret) "Скрытая папка" else field

    val numberOfFiles = numberOfFiles_
        get() = if (isSecret) 0 else field
}