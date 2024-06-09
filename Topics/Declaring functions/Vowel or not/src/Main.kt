fun isVowel(x: Char) = "aouie".contains(x, true)

fun main() {
    val y = readLine()!!
        .first()
    println(isVowel(y))
}
