package oo

enum class Color(private val rbg: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);

    fun containsRed(): Boolean {
        return this.rbg and 0xFF0000 != 0;
    }
}

fun main() {
    println(Color.RED.containsRed());
    println(Color.GREEN.containsRed());
}