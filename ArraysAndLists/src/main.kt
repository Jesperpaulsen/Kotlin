fun main() {
    // Arrays
    val array = arrayOf("Texas", "Iowa", "California")
    // Mixed Array
    val mixedArray = arrayOf(1, "Test", 4.5)
    mixedArray[0] = "hello"
    val intArray = intArrayOf(1, 2, 3)

    val electronics = arrayListOf("Mac", "Apple", "Windows", "PC")
    val concatArray =  array + electronics

    println(concatArray.size)
    val emptyArray = emptyArray<Int>()
    println(emptyArray.isEmpty())
    println(emptyArray.contains(2))

    // Immutable list
    val list = listOf("Orange", "Apple", "Bananas")

    // Mutable list
    val arrayList = arrayListOf("Hello", "World", "Good", "Bye")
    arrayList.add("Nice")
    arrayList.add(2, "Test")
    println(arrayList)

    val removed = arrayList.remove("Good");
    val removedNotExists = arrayList.remove("Gød");

    println("Removed: $removed, Removed not existing: $removedNotExists");
    println(arrayList)
}