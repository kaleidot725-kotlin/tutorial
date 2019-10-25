package standard.function

fun main(args: Array<String>): Unit {
    println()
    println("function definition")
    var result = add(1, 2)
    println("function.add ${1} + ${2} = ${result}")

    println()
    println("function init value")
    var string = toAddFormula(10)
    println("value:10 string:$string")

    string = toAddFormula(15, 2)
    println("value:15 number:2 string:$string")

    println()
    println("function name parameter")
    string = displayName("名前", "姓", "ミドルネーム")
    println(string)
    string = displayName("名", "ミドルネーム", "姓")
    println(string)
    string = displayName(lastName = "ことり", firstName = "ん", middleName = "K")
    println(string)

    return Unit
}

private fun add(x: Int, y: Int) : Int {
    return x + y
}

private fun toAddFormula(value: Int, num: Int = 1) : String {
    return "$value + $num"
}

private fun displayName(firstName  : String,
                lastName   : String,
                middleName : String) : String {
    return "$firstName $middleName $lastName"
}