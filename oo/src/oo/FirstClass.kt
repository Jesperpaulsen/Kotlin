package oo

class FirstClass(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        println("Object was created");
        this.name = name;
        this.age = age;
    }

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

//    fun getYearOfBirth(): Int {
//        return 2020 - age
//    }

    fun getYearOfBirth() = 2020 - age;
}

class ShortConstructor(val name: String, var age: Int) {
    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

//    fun getYearOfBirth(): Int {
//        return 2020 - age
//    }

    fun getYearOfBirth() = 2020 - age;
}

fun main() {
    val firstClass = FirstClass("Jesper", 25);
    println(firstClass.age);

    println(firstClass.name);

    firstClass.speak();
    firstClass.greet("World")

    println(firstClass.getYearOfBirth());

    val shortConstructor = ShortConstructor("KortJesper", 100);
    println(shortConstructor.name);
}