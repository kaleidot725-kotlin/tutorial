package advanced.dataclass

fun main(args: Array<String>) {
    class User(val name: String, val age: Int)
    data class UserData(val name: String, val age: Int)

    val user1 = User("Foobar", 100)
    val user2 = User("Foobar", 100)
    val user3 = User("Barfoo", 0)
    println("user1のhashCode : " + user1.hashCode())
    println("user2のhashCode : " + user2.hashCode())
    println("user3のhashCode : " + user3.hashCode())

    val userData1 = UserData("Foobar", 100)
    val userData2 = UserData("Foobar", 100)
    val userData3 = UserData("Barfoo", 0)
    println("userData1のhashCode : " + userData1.hashCode())
    println("userData2のhashCode : " + userData2.hashCode())
    println("userData3のhashCode : " + userData3.hashCode())
}
