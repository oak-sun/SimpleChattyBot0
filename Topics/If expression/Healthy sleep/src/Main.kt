@SuppressWarnings("MagicNumber")
fun main() {
    val (x, y, z) = List(3) { 
        readLine()!!.toInt() 
    }
    print(
        if (z in x..y) "Normal" else if (z > y) "Excess" else "Deficiency"
    )
}
