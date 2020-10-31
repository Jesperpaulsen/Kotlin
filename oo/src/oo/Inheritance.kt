package oo


open class Person(open val name: String, open var age: Int) {
    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth() = 2020 - age;
}

class Student (override val name: String, override var age: Int): Person(name, age) {
    val isIntelligent = true;

}

class Employee(override val name: String, override var age: Int): Person(name, age) {}

abstract class AbstractPerson(open val name: String, open var age: Int) {
    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth() = 2020 - age;
}

class AbstractStudent(override val name: String, override var age: Int): AbstractPerson(name, age) {
    val isIntelligent = true;

    override fun speak() {
        println("Hi, I'm a student")
    }
}


fun main() {
    val student = Student("Jesper", 25)
    val employee = Employee("Employee", 60)
    student.greet(employee.name);
    println(student.isIntelligent);
    val abstractStudent = AbstractStudent("Test ABstract", 40);
    abstractStudent.speak();
}