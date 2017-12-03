package operator

fun main(args: Array<String>): Unit {
    var a: String? = "abc"
    val l1 : Int = if(a != null) a.length else -1
    println("a ${a} length ${l1}")

    var b: String? = "bcde"
    val l2 : Int = b?.length ?: -1
    println("b ${b} length ${l2}")

    return Unit
}