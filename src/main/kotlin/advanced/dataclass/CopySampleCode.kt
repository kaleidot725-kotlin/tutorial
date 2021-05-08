package advanced.dataclass

fun main(args: Array<String>) {
    data class UserData(var name: String, var age: Int)
    val original = UserData("Foobar", 100)
    val copy = original.copy()

    println("変更前")
    println("original : " + original.toString())
    println("copy     : " + copy.toString())

    copy.name = "Bar"
    copy.age = 0

    println("変更後")
    println("original : " + original.toString())
    println("copy     : " + copy.toString())
}
