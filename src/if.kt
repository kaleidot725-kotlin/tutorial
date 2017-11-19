// if文
fun main(args: Array<String>): Unit {

    if (true) {
        println("true")
    } else {
        println("false")
    }

    val result = if (false) {
        "true"
    } else {
        "false"
    }
    println(result)

    val value = 1
    val str = when(value) {
        1 -> "one"
        2 -> "two"
        else -> "other"
    }
    println(str)

    return Unit
}