fun main() {
    List(5) { 
        readln()
    }
        .joinToString(" ")
        .let(::print)
}
