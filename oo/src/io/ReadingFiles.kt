package io

import java.io.File

fun main() {
    var lineNumber = 0
    File("src/io/inputfile.txt").forEachLine {
        lineNumber++
        println("line $lineNumber: $it")
    }

}