fun main() = readLine()!!
    .toInt()
    .let { 
        print(
            (
                it in -14..12 ||
                    it in 15..16 ||
                    it in 19..Long.MAX_VALUE
                )
                .toString()
                .capitalize()
        ) 
    }

