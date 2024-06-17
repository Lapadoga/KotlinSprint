package org.example.lesson_14

fun main() {
    val chat = Chat()
    var id = chat.addMessage("Hello", "Alex")
    chat.addThreadMessage("Hi", "Bob", id)
    id = chat.addMessage("How are you?", "Mike")
    id = chat.addThreadMessage("Fine, thanks, and you?", "Bob", id)
    chat.addThreadMessage("Fine!", "Mike", id)
    chat.addThreadMessage("Nice!", "Alex", id)
    chat.addMessage("Hello world", "Jack")

    chat.printChat()
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

    fun addThreadMessage(text: String, author: String, parentMessageId: Int): Int {
        val messageId = messageList.size
        if (messageList.find { it.id == parentMessageId } != null)
            messageList.add(ChildMessage(messageId, author, text, parentMessageId))

        return messageId
    }

    fun printChat() {
        val childMessageByParentId = messageList.filterIsInstance<ChildMessage>().groupBy { it.parentMessageId }
        messageList.forEach {
            if (it.javaClass == Message::class.java) {
                println("${it.author}: ${it.text}")
                printThread(it, childMessageByParentId, "   ")
            }
        }
    }

    private fun printThread(message: Message, threadMap: Map<Int, List<ChildMessage>>, tabString: String) {
        if (threadMap[message.id] != null) {
            threadMap[message.id]!!.forEach {
                println("$tabString${it.author}: ${it.text}")
                printThread(it, threadMap, "$tabString  ")
            }
        } else
            return
    }
}
