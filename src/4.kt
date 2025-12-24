fun main() {
    print(listOf(1, 3, 4, 8).median())
}

fun List<Int>.median(): Double {
    val sorted = this.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 1) {
        sorted[middle].toDouble()
    } else {
        (sorted[middle - 1] + sorted[middle]) / 2.0
    }
}