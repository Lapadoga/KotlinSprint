package org.example.lesson_17

class QuizElement(questionText: String) {
    val question = questionText
        get() = field

    var answer = ""
        get() = field
        set(value) {
            field = value
        }
}