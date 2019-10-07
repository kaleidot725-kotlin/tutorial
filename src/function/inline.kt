package function

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun main(args: Array<String>): Unit {
    // inline
    inlinetest()

    // noinline
    noinlinetest()

    return Unit
}

private inline fun <T> lockInlined(lock : Lock, body : () -> T) : T
{
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}

private fun <T> lockOrdinary(lock : Lock, body : () -> T) : T
{
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}

private inline fun inlineAndNoInlineLambda(inlined: () -> Unit, noinline notInline: () -> Unit) {
    inlined()
    notInline()
}

private inline fun nocrosslineLamda(lambda : () -> Unit) {
    val f = object : Runnable {
        override fun run() {
            //lambda()  //ローカルオブジェクトでは呼べない
        }
    }

    {
        //lambda() //ネストした関数では呼べない
    }.invoke()
}

private inline fun crosslineLambda(crossinline  lambda: () -> Unit)
{
    val f = object : Runnable {
        override fun run() {
            lambda() // crosslineにしたことで呼べるようになる
        }
    }

    {
        lambda() // corsslineにしたことで呼べるようになる
    }.invoke()
}

private fun inlinetest() {
    val obj: Lock = ReentrantLock()

    // ineline関数でないので非局所リターンが許可されていない
    lockOrdinary(obj) {
        //return /* コンパイルエラーとなる */
    }

    // inline関数であるので非局所リターンが許可されている
    lockInlined(obj) {
        return
    }
}

private fun noinlinetest() {
    inlineAndNoInlineLambda({ println("inline function")}, { println("noinline function") })
}




