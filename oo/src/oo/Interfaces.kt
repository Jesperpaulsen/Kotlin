package oo

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: String): Driveable {
    override fun drive() {
        println("Driving car")
    }
}

class Motorcycle(val color: String): Driveable, Buildable {
    override fun drive() {
        println("Driving motorcycle");
    }

    override val timeRequired: Int = 120
    override fun build() {
        println("Building motorcycle ")
    }
}

fun main() {
    val car: Driveable = Car("Blue")
    car.drive();
    val mc: Driveable = Motorcycle("Red")
    mc.drive();
}