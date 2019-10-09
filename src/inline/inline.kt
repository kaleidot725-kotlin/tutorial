package inline

fun main(args: Array<String>): Unit {
    hello()
}

private inline fun hello() {
    print("Hello")
}
