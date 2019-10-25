package advanced.dataclass

fun main(args: Array<String>) {
    data class UserData(val name: String, val age: Int)
    val userData1 = UserData("Foobar", 100)
    println("userData1のcomponent1 : " + userData1.component1())
    println("userData1のcomponent2 : " + userData1.component2())

    data class SubUserData(val age: Int, val name: String)
    val subUserData1 = SubUserData(100, "Foobar")
    println("subUserDataのcomponent1 : " + subUserData1.component1())
    println("subUserDataのcomponent2 : " + subUserData1.component2())
}

