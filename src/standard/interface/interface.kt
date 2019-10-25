package standard.`interface`

fun main(args: Array<String>): Unit {
    val child = Child()
    child.bar()
    child.foo()
}

interface MyInterface {
    fun bar()
    fun foo() {
        println("call foo method")
    }
}

class Child : MyInterface {
    override fun bar() {
        println("Child call bar method")
    }
}