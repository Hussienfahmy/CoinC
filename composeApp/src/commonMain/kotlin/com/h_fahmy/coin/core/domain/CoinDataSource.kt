package com.h_fahmy.coin.core.domain

import com.h_fahmy.coin.core.domain.util.NetworkError
import com.h_fahmy.coin.core.domain.util.Result
import com.h_fahmy.coin.crypto.domain.Coin

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}