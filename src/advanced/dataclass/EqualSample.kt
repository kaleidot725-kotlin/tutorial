package advanced.dataclass

fun main(args: Array<String>) {
    class User(val name: String, val age: Int)
    data class UserData(val name: String, val age: Int)

    val user1 = User("Foobar", 100)
    val user2 = User("Foobar", 100)
    println("クラス 同じインスタンス : " + user1.equals(user1))
    println("クラス 別のインスタンス : " + user1.equals(user2))

    val userData1 = UserData("Foobar", 100)
    val userData2 = UserData("Foobar", 100)
    println("データクラス 同じインスタンス : " + userData1.equals(userData2))
    println("データクラス 別のインスタンス : " + userData1.equals(userData2))
}


