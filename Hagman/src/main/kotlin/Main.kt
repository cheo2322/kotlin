import kotlin.random.Random

val words = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
var word = ""
val guesses = arrayListOf<Char>()
var remainGuesses = 6
var mistakes = 0

fun main(args: Array<String>) {
    setupGame()
}

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].uppercase()

    println(word)

    for (i in word.indices) {
        guesses.add('_')
    }

    var gameOver = false

    do {
        printGameStatus()
        println("Please enter a letter:")

        val input = readLine() ?: ""

        if (input.isEmpty()) {
            println("That's not a valid input. Please try again!")
        } else {
            val letter = input[0].uppercaseChar()

            if (word.contains(letter)) {
                for (i in word.indices) {
                    if (word[i] == letter) {
                        guesses[i] = letter
                    }
                }

                if (!guesses.contains('_')) {
                    gameOver = true
                }
            } else {
                println("Sorry! That's not part of the word")

                remainGuesses--
                mistakes++

                if (mistakes == 6) {
                    gameOver = true
                }
            }
        }
    } while (!gameOver)

    if (mistakes == 6) {
        printGameStatus()
        println("Sorry! You lost. The word was ${word.uppercase()}")
    } else {
        println("Congratulations! You win. The word was ${word.uppercase()}")
    }
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

    print("Word: ")
    for (element in guesses) {
        print("$element ")
    }

    println("\nYou have $remainGuesses guess(es) left")
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