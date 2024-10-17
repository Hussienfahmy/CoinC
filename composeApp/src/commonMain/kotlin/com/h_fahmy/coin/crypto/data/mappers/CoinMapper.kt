package com.h_fahmy.coin.crypto.data.mappers

import com.h_fahmy.coin.crypto.data.networking.dto.CoinDto
import com.h_fahmy.coin.crypto.data.networking.dto.CoinPriceDto
import com.h_fahmy.coin.crypto.domain.Coin
import com.h_fahmy.coin.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

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


fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochMilli(time)
            .atZone(ZoneId.systemDefault())
    )
}