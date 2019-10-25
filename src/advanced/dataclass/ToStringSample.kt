package advanced.dataclass

fun main(args: Array<String>) {
    class User(val name: String, val age: Int)
    data class UserData(val name: String, val age: Int)

    val user1 = User("Foobar", 100)
    println("user1のtoString : " + user1.toString())

    val userData1 = UserData("Foobar", 100)
    println("userData1のtoString : " + userData1.toString())
}