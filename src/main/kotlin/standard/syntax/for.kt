package standard.syntax

fun main(args: Array<String>): Unit {
    println("for")
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for(i in array) {
        print(i)
    }

    println("")
    println("range")
    for (i in 0..4){
        print(i)
    }

    println("")
    println("downTo")
    for (i in 4 downTo 0) {
        print(i)
    }

    println("")
    println("while")
    var i  = 0
    while (i < 10) {
        print(i++)
    }

    println("")
    println("do-while")
    var ii = 0
    do {
        print(ii++)
    } while(ii < 10)

    return Unit;
}