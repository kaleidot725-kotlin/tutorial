package Extension.B

// 拡張関数・拡張プロパティを他パッケージで利用する際はインポートする
// 同一パッケージ内であればimportは不要
import Extension.define.appendBeer
import Extension.define.lastIndex

fun main(args: Array<String>): Unit {
    // Extension Function
    println("I like ".appendBeer())

    // Extension Property
    val arr = listOf(1, 2, 3)
    println("Array LastIndex " + arr.lastIndex);
}

