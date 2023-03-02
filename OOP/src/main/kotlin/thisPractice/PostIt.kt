package thisPractice

fun main() {
    val note = PostIt()
    note.printMessage()
    note.updateMessage("New message")
    note.printMessage()
}

class PostIt {
    private var message = "No message"

    fun updateMessage(message: String) {
        this.message = message
    }

    fun printMessage() {
        println(this.message)
    }
}