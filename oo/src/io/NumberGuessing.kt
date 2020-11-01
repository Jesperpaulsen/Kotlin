package io

import java.lang.NumberFormatException
import java.util.Random

fun main() {
    val number = Random().nextInt(100) + 1
    var input: String?
    var guess = -1

    while (guess != number) {
        print("Guess a number between 1 and 100: ")
        input = readLine();

        if (input != null) {
            try {
                guess = input.toInt();
            } catch (e: NumberFormatException) {
                println("Input needs to be a number")
                continue;
            }
        }

        if (guess < number) {
            println("Too low")
        }
        else if (guess > number) {
            println("Too high")
        }
        else {
            println("You won")
        }
    };
}