package com.h_fahmy.coin.core.domain

import com.h_fahmy.coin.core.domain.util.NetworkError
import com.h_fahmy.coin.core.domain.util.Result
import com.h_fahmy.coin.crypto.domain.Coin
import com.h_fahmy.coin.crypto.domain.CoinPrice
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError>
}