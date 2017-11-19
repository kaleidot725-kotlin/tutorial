fun main(args: Array<String>): Unit {
    var a: String = "abc"
    var l : Int = a.length
    println("a ${a} length ${l}")

    var b: String? = "bcde"
    l = if (b != null) b.length else -1
    println("b ${b} length ${l}")

    var c: String? = "cdedf"
    var m : Int? = c?.length
    println("c ${c} length ${m}")

    return Unit
}