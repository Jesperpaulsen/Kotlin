package io

fun main() {
    print("Enter the word to guess: ")
    val word = readLine()
    if (word == null){
        println("No word given, game ended")
        return
    }
    for (i in 1..100) println()
    println("Enter your guess")

    val letters = word.toLowerCase().toCharArray().toHashSet();
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses) {
        printExploredWord(word, correctGuesses)
        println("# Wrong guesses: $fails \n\n")

        val input = readLine()
        if (input == null) {
            continue
        } else if (input.length != 1) {
            println("Please enter one letter")
            continue
        }

        if (word.toLowerCase().contains(input.toLowerCase())) {
            correctGuesses.add(input[0].toLowerCase())
        } else {
            fails++
        }
    }

    printExploredWord(word, correctGuesses)
    println("# Wrong guesses: $fails \n\n")
    println("Well done")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (char in word.toLowerCase()) {
        if (correctGuesses.contains(char)) print("$char ")
        else print ("_ ")
    }
    println()
}