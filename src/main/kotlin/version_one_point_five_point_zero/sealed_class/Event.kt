package version_one_point_five_point_zero.sealed_class

sealed class Event {
    open val navigationId = -1

    object NavigateMain: Event() {
        override val navigationId: Int = 1
    }

    sealed class Error: Event() {
        open val error = "エラーが発生しました"

        object NavigateNotFoundError : Error() {
            override val navigationId: Int = 2
            override val error: String = "該当のデータが見つかりませんでした"
        }

        object NavigateNetworkError : Error() {
            override val navigationId: Int = 3
            override val error: String = "ネットワークエラーが発生しました"
        }

        sealed class ErrorWithImage: Error() {
            open val errorImageId = 1

            object NavigateNotSupportError: ErrorWithImage() {
                override val navigationId: Int = 4
                override val error: String = "想定外のエラーが発生しました以下に問い合わせください"
                override val errorImageId: Int = 1 // 問い合わせ情報が記載された画像を表示できるようにする
            }
        }
    }
}
