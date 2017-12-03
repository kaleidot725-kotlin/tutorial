package `object`

fun main(args: Array<String>): Unit {
    // 初期
    println(DataProviderManager.provider.value)

    // 登録後
    DataProviderManager.registerDataProvider(DataProvider(200))
    println(DataProviderManager.provider.value)
}

class DataProvider {
    var value : Int = 100

    constructor(value : Int) {
        this.value = value
    }
}

object DataProviderManager {
    var provider : DataProvider = DataProvider(100)

    fun registerDataProvider(provider: DataProvider) {
        DataProviderManager.provider = provider
    }
}

