package function

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun main(args: Array<String>): Unit {
    val obj: Lock = ReentrantLock()
    lock(obj, { println("call foo function") })
    return Unit
}

private inline fun <T> lock(lock : Lock, body : () -> T) : T
{
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}