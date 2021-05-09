package version_one_point_five_point_zero.sealed_interface

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val event =  when (Random.nextInt(IntRange(1, 4))) {
        1 -> NavigateMain
        2 -> NavigateNotFoundError
        3 -> NavigateNetworkError
        4 -> NavigateNotSupportError
        else -> null
    }

    when(event) {
        NavigateMain -> {
            println("NavigateMain ${event.navigationId}")
        }
        is NavigateNotFoundError -> {
            println("NavigateNotFoundError ${event.navigationId} ${event.error}")
        }
        is NavigateNetworkError -> {
            println("NavigateNetworkError ${event.navigationId} ${event.error}")
        }
        is NavigateNotSupportError -> {
            println("NavigateNotSupportError ${event.navigationId} ${event.error} ${event.errorImageId}")
        }
    }
}
