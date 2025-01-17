package com.h_fahmy.coin

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.h_fahmy.coin.di.initKoin

fun main() = application {
    initKoin()

    Window(
        onCloseRequest = ::exitApplication,
        title = "CoinC",
    ) {
        App()
    }
}