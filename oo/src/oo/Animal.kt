package oo

class Animal {
    // Customized setter
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}

fun main() {
    val animal = Animal();
    animal.age = 8
    animal.age = -4
    println(animal.age)
}