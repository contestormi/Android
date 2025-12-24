fun main() {
    val numbers = listOf(1, 2, 3, 4)
    val result = applyToList(numbers) { it * 2 }
    println(result)
}

fun applyToList(
    numbers: List<Int>,
    operation: (Int) -> Int
): List<Int> {
    return numbers.map(operation)
}