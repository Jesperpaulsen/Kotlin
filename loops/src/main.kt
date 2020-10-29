fun main() {
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5 ) break@outer;
            println("$i - $j");
        }
    }

    val numbers = listOf(1, 2, 3, 4, 5);
    println(reverseList(numbers));
    println(reverseList2(numbers))
}

fun reverseList(inputList: List<Int>): List<Int> {
    val result = arrayListOf<Int>()

    for (i in inputList.indices) {
        result.add(inputList[inputList.size - i - 1])
    }

    return result;
}

fun reverseList2(inputList: List<Int>): List<Int> {
    val result = arrayListOf<Int>();

    for (i in inputList.size - 1 downTo 0) {
        result.add(inputList[i])
    }
    return result;
}