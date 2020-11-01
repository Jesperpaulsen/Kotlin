package collections

import java.io.File

fun main() {
    val ipToCount = mutableMapOf<String, Int>()

    File("src/collections/60.ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount[it] = previous + 1
    }

    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }!!

    println("Max ip was $maxIp with $maxCount entries")
}