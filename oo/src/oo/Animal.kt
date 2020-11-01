package oo

open class Animal {
    // Customized setter
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    private var name: String = ""
    protected var surName = "Sam" // Child has access
    internal val isDangerous = true; // Only visible within same module

    fun hasName(): Boolean = name.isNotEmpty();
}

class Vertebrate : Animal() {
    fun getSurname() = this.surName;
}

fun main() {
    val animal = Animal();
    animal.age = 8
    animal.age = -4
    println(animal.age)

    animal.hasName()
}