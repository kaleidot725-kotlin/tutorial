package standard.`class`

fun main(args: Array<String>): Unit {
    val kotlin = Person("Kotlin")
    val kotlin2 = Person("Kotlin2", kotlin)
    kotlin.call()
    kotlin2.call()

    var human = Human()
    human.accessor = "foo human"
    human.accessor = "bar human"
    println(human.oldname)
    println(human.name)

}

private class Person (val name: String) {
    init {
        println("init")
        println("name = $name")
    }

    constructor(name: String, parent: Person) : this(name) {
        println("secondary constructor")
    }

    fun call(){
        println("$name call method")
    }
}

private class Human(){
    var oldname : String = ""
    var name : String = ""
    var accessor : String
        get() = this.name
        set(value) {
            this.oldname = this.name
            this.name = value
        }
}


