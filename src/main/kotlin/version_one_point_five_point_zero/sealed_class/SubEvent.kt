package version_one_point_five_point_zero.sealed_class

data class SubEvent(private val message: String) : Event()
