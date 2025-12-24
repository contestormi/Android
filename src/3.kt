import java.util.Locale.getDefault

fun main() {
    print("ывиацпушкрйыва".countVowels())
}

fun String.countVowels(): Int {
    val vowels = setOf(
        'a', 'e', 'i', 'o', 'u', 'y', 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'
    )

    return this.lowercase(getDefault()).count { it in vowels }
}