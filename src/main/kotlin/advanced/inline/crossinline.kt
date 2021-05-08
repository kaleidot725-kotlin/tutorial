package advanced.inline

fun main(args: Array<String>) {
    crossinlineLamda {
        print("hello")
    }
}

private inline fun crossinlineLamda(crossinline lambda: () -> Unit) {
    lambda() // ここでは呼べる

    val f = object : Runnable {
        override fun run() {
            lambda() // crosslineにしたことで呼べるようになる
        }
    }

    {
        lambda() // corsslineにしたことで呼べるようになる
    }.invoke()
}

/*
private inline fun nocrosslineLamda(lambda : () -> Unit) {
    lambda() // ここでは呼べる

    val f = object : Runnable {
        override fun run() {
            //lambda()  //ローカルオブジェクトでは呼べない
        }
    }

    {
        //lambda() //ネストした関数では呼べない
    }.invoke()
}
*/
