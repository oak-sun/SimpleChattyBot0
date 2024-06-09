@SuppressWarnings("all")
fun main() = println(
    List(readLine()!!.toInt()) { readLine()!!.toInt() }
        .sorted()
        .last { it % 4 == 0 }
)

