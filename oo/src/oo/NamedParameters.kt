package oo

class House(val height: Double, val color: String, val price: Int = 50000) {
    fun print() {
        println("House [Height=$height, color=$color, price=$price]")
    }
}

fun main() {
    val house = House(height = 5.0, color = "Blue", price = 3);
    val redHouse = House(color = "Red", height = 2.34, price = 4);
    val yellowHouse = House(height = 1.2, color = "Yellow")

    house.print();
    redHouse.print();
    yellowHouse.print()
}