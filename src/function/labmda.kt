package function

fun main(args: Array<String>): Unit {
    // Params
    val a = 100
    val b = 200

    // Max
    var bool = JudgeParams<Int>(a, b, fun(src: Int, dist: Int): Boolean { return (dist < src) })
    println("$a $b $bool")

    // Min 通常
    bool = JudgeParams<Int>(a, b, { src, dist -> src < dist })
    println("$a $b $bool")

    // Min ラムダ式の外出し
    bool = JudgeParams<Int>(a, b) { src, dist -> src < dist }
    println("$a $b $bool")
}

private fun <T> JudgeParams (a : T, b : T, function : (T, T) -> Boolean ) : Boolean
{
    return function(a, b)
}