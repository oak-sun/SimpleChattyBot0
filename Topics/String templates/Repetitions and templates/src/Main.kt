fun main() = readLine()!!.let { 
    print(
        "${it.length} repetitions of the word $it: ${it.repeat(it.length)}"
    )
}
