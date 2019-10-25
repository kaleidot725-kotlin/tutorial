package standard.syntax

fun main(args: Array<String>): Unit {
    val i = 42
    val s = "すべての答え:$i"
    println(s)

    val s1 = "1 + 1は${1 + 1}です。"
    val s2 = "s1の長さは${s1.length}です。"
    println(s1)
    println(s2)

    return Unit
}