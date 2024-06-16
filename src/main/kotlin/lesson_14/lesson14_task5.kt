package org.example.lesson_14

fun main() {

}

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text)

class Chat(
    val messageList: MutableList<Message> = mutableListOf(),
) {
    fun addMessage(text: String, author: String): Int {
        val messageId = messageList.size
        messageList.add(Message(messageId, author, text))

        return messageId
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        if (messageList.find { it.id == parentMessageId } != null)
            messageList.add(ChildMessage(messageList.size, author, text, parentMessageId))
    }

    fun printChat() {
        messageList.groupBy { }
    }
}
