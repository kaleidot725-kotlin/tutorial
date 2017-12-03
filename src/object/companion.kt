package `object`

fun main(args: Array<String>): Unit {
    val instance = CompanionObject.create()
    println(instance.name)
}

private class CompanionObject {
    val name : String = "object.CompanionObject"
    companion object {
        fun create() : CompanionObject = CompanionObject()
    }
}