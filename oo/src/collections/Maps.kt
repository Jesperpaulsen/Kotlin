package collections

fun main() {
    val namesToAges = mapOf(Pair("Jesper", 25), Pair("Test", 42))
    val namesToAges2 = mapOf("Jesper" to 25, "Test" to 42)

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToInhabitants = mutableMapOf(
            "Germany" to 80_000_000,
            "USA" to 300_000_000
    )
    countryToInhabitants["Australia"] = 23_000_000
    countryToInhabitants.putIfAbsent("USA", 320_000_000)

    println(countryToInhabitants)
    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.containsValue(10_000))

    println(countryToInhabitants.get("Germany"))
    println(countryToInhabitants.getOrDefault("France", 0))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old")
    }
}