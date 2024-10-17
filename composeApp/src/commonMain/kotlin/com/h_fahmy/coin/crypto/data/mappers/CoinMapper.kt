package com.h_fahmy.coin.crypto.data.mappers

import com.h_fahmy.coin.crypto.data.networking.dto.CoinDto
import com.h_fahmy.coin.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}