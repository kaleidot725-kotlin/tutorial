package standard.`interface`

fun main(args: Array<String>): Unit {
    // インタフェース実装クラス
    val multi = MultipleInterfaceClass()
    multi.MethodA()
    multi.MethodB()
    multi.MethodC()

    // 匿名クラス
    val a = object: InterfaceA {
        override fun MethodA(){
            println("anonymouse call methodA")
        }
    }
    a.MethodA()
}

interface InterfaceA {
    fun MethodA()
}

interface InterfaceB {
    fun MethodB()
}

interface InterfaceC : InterfaceB {
    fun MethodC()
}

class MultipleInterfaceClass : InterfaceA, InterfaceC {
    override fun MethodA() {
        println("MultipleInterfaceClass call MethodA")
    }

    override fun MethodB() {
        println("MultipleInterfaceClass call MethodB")
    }

    override fun MethodC() {
        println("MultipleInterfaceClass call MethodC")
    }
}