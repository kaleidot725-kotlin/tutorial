package Extension.define

fun main(args: Array<String>): Unit {
    // Extension Function
    println("I like ".appendBeer())

    // Extension Property
    val arr = listOf(1, 2, 3)
    println("Array LastIndex " + arr.lastIndex);
}

// Extension Function
fun String.appendBeer() : String = "${this}beer!"

// Extension Property
val <T> List<T>.lastIndex : Int
    get() = size -1
