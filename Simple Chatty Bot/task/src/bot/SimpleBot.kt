package bot

fun main() {
    hello()
    reminder()
    guesser()
    counter()
    test()
    goodbye()
}
fun hello() = println("Hello! My name is \"Paphnutiy.\n" +
        "I was created in 2024.\nPlease, remind me your name.")

fun reminder() = println("What a great name you have, ${readln()}!")

fun guesser() {
    println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.")
    val (one, two, three) = List(3) { readln().toInt() }
    println("Your age is " +
            "${one.times(70).plus(two.times(21)).plus(three.times(15)).rem(105)}; " +
            "that's a good time to start programming!")
}

fun counter() {
    println("Now I will prove to you that I can count to any number you want.")
    (0..readln().toInt()).forEach { println("$it!") }
}


fun test() {
    println("Let's test your programming knowledge. \n" +
            "Who is the author of these lines \"Eat pineapples, grouse chew - your last day comes bourgeois?\"\n" +
            "1. Leo Tolstoy\n" +
            "2. Joseph Vissarionovich Stalin\n" +
            "3. Alexander Sergeevich Pushkin\n" +
            "4. Vladimir Mayakovsky")
    var answer = readln()
    while (answer != "4") {
        println("Please, try again.")
        answer = readln()
    }
}

fun goodbye() = println("Congratulations, have a nice day!")
