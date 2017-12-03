package dataclass

fun main(args: Array<String>): Unit {
    // DataClass
    val person = Person(41, "Sum")
    println("person name " + person.name)

    // ToString
    println("person " + person.toString())

    // ComponentN
    println("person.component1(id) " + person.component1())
    println("person.component2(name) " + person.component2())

    // Copy
    val person2 = person.copy(id = 44)
    println("person2 " + person2.toString())

    person2.name = "Stack"
    println("person2 " + person2.toString())

    // Equal
    var equal = person == person2
    println("person == person2 = $equal")

    val person3 = Person(41, "Sum")
    println("person3 " + person3.toString())

    equal = person == person3
    println("person == person3 = $equal")

    // Destructuring Declarations
    val (id, name) = person
    println("id: $id - name: $name")
}

private data class Person(val id: Long, var name: String)