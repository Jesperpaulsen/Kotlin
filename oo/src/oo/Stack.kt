package oo

// vararg takes multiple arguments
class Stack<E>(private vararg val items: E) {
    private val elements = items.toMutableList();

    fun push(element: E){
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    private fun isEmpty(): Boolean = elements.isEmpty();
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements) // * is spread operator in Kotlin
}

fun main() {
    val stack = Stack(2, 4, 5, 6, 7);
    println(stack.pop())
    stack.push(9)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    val stack2 = stackOf("Hi", "Hey", "Hello")

    for (i in 1..3) {
        println(stack2.pop())
    }
}