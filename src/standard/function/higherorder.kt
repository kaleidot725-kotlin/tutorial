package standard.function

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun main(args: Array<String>): Unit {
    val obj: Lock = ReentrantLock()
    val number = lockInlined<Int>(obj, ::getNumber)
    println("get number $number")

    return Unit
}

private fun getNumber () : Int {
    return 100
}

private fun <T> lockInlined(lock: Lock, body: () -> T) : T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}