package advanced.inline

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

fun main(args: Array<String>): Unit {
    val obj: Lock = ReentrantLock()

    println("Start")

    inlineLock(obj) {
        return
    }

    println("End")
}

private inline fun inlineLock(l : Lock, body: () -> Unit) {
    l.lock()
    try {
        return body()
    }
    finally {
        l.unlock()
    }
}

private fun ordinalyLock(l: Lock, body: () -> Unit) {
    l.lock()
    try {
        return body()
    }
    finally {
        l.unlock()
    }
}

