@SuppressWarnings("All")
fun main() = print(
    List(3) { readLine() }
        .distinct()
        .size == 3
)

