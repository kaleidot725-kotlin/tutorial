package advanced.deletgation

//----------------------------------------------------------------------------------------------------------------------
// 複数インタフェースを移譲する場合
//----------------------------------------------------------------------------------------------------------------------

interface ButtonController {
    fun up()
    fun down()
    fun right()
    fun left()
    fun a()
    fun b()
    fun plus()
    fun minus()
    fun home()
    fun one()
    fun two()
}

interface GyroController {
    fun xyz(x: Float, y: Float, z: Float)
}

class ButtonControllerImpl : ButtonController {
    override fun up() {
        println("put up")
    }

    override fun down() {
        println("put down")
    }

    override fun left() {
        println("put left")
    }

    override fun right() {
        println("put right")
    }

    override fun a() {
        println("put a")
    }

    override fun b() {
        println("put b")
    }

    override fun home() {
        println("put home")
    }

    override fun plus() {
        println("put plus")
    }

    override fun minus() {
        println("put minus")
    }

    override fun one() {
        println("put one")
    }

    override fun two() {
        println("put two")
    }
}

class GyroControllerImpl : GyroController {
    override fun xyz(x: Float, y: Float, z: Float) {
        println("update xyz")
    }
}

class WiiController(private val button: ButtonController, private val gyro: GyroController) : ButtonController by button,
    GyroController by gyro

//----------------------------------------------------------------------------------------------------------------------
// 1つのインタフェースを移譲する場合
//----------------------------------------------------------------------------------------------------------------------
interface ClosedShape {
    val name: String
    fun area(): Int
    fun new1()
    fun new2()
    fun new3()
}

class Rectangle(override val name: String, val width: Int, val height: Int) : ClosedShape {
    override fun area() = width * height
    override fun new1() {
        println("call new1")
    }

    override fun new2() {
        println("call new2")
    }

    override fun new3() {
        println("call new3")
    }
}

class Window(private val bounds: ClosedShape) : ClosedShape by bounds

fun main(args: Array<String>) {
    val rect = Rectangle("rectanble", 10, 10)
    val window = Window(rect)
    println(window.name)
    println(window.area())
    window.new1()
    window.new2()
    window.new3()
}
