package advanced.inline

fun main(args: Array<String>): Unit {
    val sum = plus(10, 10)
    println(sum)
}

private inline fun plus(a: Int, b: Int): Int {
    return a + b
}