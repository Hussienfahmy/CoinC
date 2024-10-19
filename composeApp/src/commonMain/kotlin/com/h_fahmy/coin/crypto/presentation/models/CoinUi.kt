package com.h_fahmy.coin.crypto.presentation.models

import com.h_fahmy.coin.core.presentation.util.formatFloat
import com.h_fahmy.coin.crypto.domain.Coin
import com.h_fahmy.coin.core.presentation.util.getDrawableForCoin
import com.h_fahmy.coin.crypto.presentation.coin_detail.chart.DataPoint
import org.jetbrains.compose.resources.DrawableResource

data class CoinUi(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: DisplayableNumber,
    val priceUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber,
    val iconRes: DrawableResource,
    val coinPriceHistory: List<DataPoint> = emptyList()
)

data class DisplayableNumber(
    val value: Double,
    val formatted: String
)

fun Coin.toCoinUi(): CoinUi {
    return CoinUi(
        id = id,
        name = name,
        symbol = symbol,
        rank = rank,
        priceUsd = priceUsd.toDisplayableNumber(),
        marketCapUsd = marketCapUsd.toDisplayableNumber(),
        changePercent24Hr = changePercent24Hr.toDisplayableNumber(),
        iconRes = getDrawableForCoin(symbol)
    )
}

fun Double.toDisplayableNumber(): DisplayableNumber {
    return DisplayableNumber(
        value = this,
        formatted = formatFloat(this.toFloat(), 2, 2)
    )
}