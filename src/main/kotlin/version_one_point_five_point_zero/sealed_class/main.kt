package version_one_point_five_point_zero.sealed_class

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val event =  when (Random.nextInt(IntRange(1, 4))) {
        1 -> Event.NavigateMain
        2 -> Event.Error.NavigateNotFoundError
        3 -> Event.Error.NavigateNetworkError
        4 -> Event.Error.ErrorWithImage.NavigateNotSupportError
        else -> null
    }

    when(event) {
        Event.NavigateMain -> {
            println("NavigateMain ${event.navigationId}")
        }
        is Event.Error.NavigateNotFoundError -> {
            println("NavigateNotFoundError ${event.navigationId} ${event.error}")
        }
        is Event.Error.NavigateNetworkError -> {
            println("NavigateNetworkError ${event.navigationId} ${event.error}")
        }
        is Event.Error.ErrorWithImage.NavigateNotSupportError -> {
            println("NavigateNotSupportError ${event.navigationId} ${event.error} ${event.errorImageId}")
        }
    }
}
