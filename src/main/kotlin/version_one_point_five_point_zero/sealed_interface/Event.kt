package version_one_point_five_point_zero.sealed_interface

sealed interface Event {
    val navigationId: Int
}

sealed interface ErrorMessage {
    val error: String
}

sealed interface ErrorImage {
    val errorImageId: Int
}

object NavigateMain : Event {
    override val navigationId: Int = 1
}

object NavigateNotFoundError: Event, ErrorMessage {
    override val navigationId: Int = 2
    override val error: String = "該当のデータが見つかりませんでした"
}

object NavigateNetworkError: Event, ErrorMessage {
    override val navigationId: Int = 3
    override val error: String = "ネットワークエラーが発生しました"
}

object NavigateNotSupportError: Event, ErrorMessage, ErrorImage {
    override val navigationId: Int = 4
    override val error: String = "想定外のエラーが発生しました以下に問い合わせください"
    override val errorImageId: Int = 1 // 問い合わせ情報が記載された画像を表示できるようにする
}