fun main () {
    print(concatinate("hfgjdgf", null))
}

fun concatinate(a: String?, b: String?): String {
    return (a ?: "") + (b ?: "")
}