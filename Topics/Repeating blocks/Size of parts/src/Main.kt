fun main() = List(readln().toInt()) {
    readln().toInt()
}
    .groupBy { it }
    .let { 
        println("${it[0]?.size ?: 0} ${it[1]?.size ?: 0} ${it[-1]?.size ?: 0}") 
    }
