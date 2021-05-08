package standard.inheritance

fun main(args: Array<String>): Unit {
    val student : Student = Student("Sum", 41)
    student.introduceMySelf()
}

private open class Person(val name: String) {
    open fun introduceMySelf() {
        println("I am $name.")
    }
}

private class Student(name: String, val id: Long) : Person(name) {
    override fun introduceMySelf() {
        println("I am $name. (id=$id)")
    }
}
