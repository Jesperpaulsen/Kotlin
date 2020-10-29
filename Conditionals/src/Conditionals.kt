import java.util.*

fun main() {
    val age: Int = 15;
    if (age < 18) {
        println("You can not register");
    } else {
        println("You're good to go");
    }

    val mode: Int = 2;

    when (mode) {
        1 -> println("Mode is lazy");
        2 -> println("The mode is 2");
        3 -> println("The mode is 3");
        else -> println("Unkown mode");
    }

    val ifResult = if (mode < 2) {
        println("You can not register");
    } else {
        println("You're good to go");
    }

    print(ifResult);

    val result = when (mode) {
        1 -> "Mode is lazy";
        2 -> {
            "The mode is 2";
            "This is the last line";
        };
        3 -> "The mode is 3";
        else -> "Unkown mode";
    }

    println(result);

    val x = Random().nextInt(20) + 1;
    println("X: $x")
    when (x) {
        5 -> println("x is 5");
        3*12 -> println("3 * 12");
        "Hey there".length -> println("x is the length of hey there");
        in 1..10 -> println("X is between 1 and 10");
        !in 1..9 -> println("X is not between 1 and 9");
    }
}