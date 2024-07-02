package org.example.lesson_17

class QuizElement(questionText: String) {
    private val question = questionText
        get() = field

    private var answer = ""
        get() = field
        set(value) {
            field = value
        }
}