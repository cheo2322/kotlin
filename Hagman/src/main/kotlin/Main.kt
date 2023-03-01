import kotlin.random.Random

fun main() {
    val words =
        listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")

    playGame(setupWord(words))
}

fun setupWord(words: List<String>): String {
    val wordIndex = Random.nextInt(words.size)
    val word = words[wordIndex].uppercase()

    println(word)
    return word
}

fun playGame(word: String) {
    var gameOver = false
    var remainGuesses = 6
    var mistakes = 0
    val guesses = arrayListOf<Char>()

    for (i in word.indices) {
        guesses.add('_')
    }

    do {
        printGameStatus(mistakes, remainGuesses, guesses)
        println("Please enter a letter:")

        val input = readlnOrNull() ?: ""

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

                    println("Congratulations! You win. The word was ${word.uppercase()}")
                }
            } else {
                println("Sorry! That's not part of the word")

                remainGuesses--
                mistakes++

                if (mistakes == 6) {
                    gameOver = true

                    printGameStatus(mistakes, remainGuesses, guesses)
                    println("Sorry! You lost. The word was ${word.uppercase()}")
                }
            }
        }
    } while (!gameOver)
}

fun printGameStatus(mistakes: Int, remainGuesses: Int, guesses: ArrayList<Char>) {
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