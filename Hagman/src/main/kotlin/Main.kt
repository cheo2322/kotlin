import java.util.*
import kotlin.random.Random

val words = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
var word = ""
val guesses = arrayListOf<Char>()
val remainGuesses = 6
val mistakes = 0

fun main(args: Array<String>) {
    setupGame()
}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].uppercase(Locale.getDefault())

    println(word)

    printGameStatus()
}

fun printGameStatus() {
    when (mistakes) {
        0 -> print0Mistakes()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }
}

fun print0Mistakes() {
    println("   |------|-")
    println("   |      | ")
    println("   |        ")
    println("   |        ")
    println("   |        ")
    println("   |        ")
    println("  /|\\      ")
    println(" / | \\     ")
}

fun print1Mistake() {
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |        ")
    println("   |        ")
    println("   |        ")
    println("  /|\\      ")
    println(" / | \\     ")
}

fun print2Mistakes() {
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |      | ")
    println("   |      | ")
    println("   |        ")
    println("  /|\\      ")
    println(" / | \\     ")
}

fun print3Mistakes() {
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |     /| ")
    println("   |      | ")
    println("   |        ")
    println("  /|\\      ")
    println(" / | \\     ")
}

fun print4Mistakes() {
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |     /|\\")
    println("   |      | ")
    println("   |        ")
    println("  /|\\      ")
    println(" / | \\     ")
}

fun print5Mistakes() {
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |     /|\\")
    println("   |      | ")
    println("   |     /  ")
    println("  /|\\      ")
    println(" / | \\     ")
}

fun print6Mistakes() {
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |     /|\\")
    println("   |      | ")
    println("   |     / \\")
    println("  /|\\      ")
    println(" / | \\     ")
}