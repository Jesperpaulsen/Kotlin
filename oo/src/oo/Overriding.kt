package oo

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course")
    }
}

interface Learnable {
    fun learn() {
        print("Learning...");
    }
}

open class KotlinCourse() : Course("Kotlin", 999.99), Learnable {
    final override fun learn() {
        super<Course>.learn()
        println("I'm learning kotlin")
    }
}

fun main() {
    KotlinCourse().learn();
}