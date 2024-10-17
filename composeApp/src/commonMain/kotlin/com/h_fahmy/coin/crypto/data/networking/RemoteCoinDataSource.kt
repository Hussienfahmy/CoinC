package com.h_fahmy.coin.crypto.data.networking

import com.h_fahmy.coin.core.data.networking.constructUrl
import com.h_fahmy.coin.core.data.networking.safeCall
import com.h_fahmy.coin.core.domain.CoinDataSource
import com.h_fahmy.coin.core.domain.util.NetworkError
import com.h_fahmy.coin.core.domain.util.Result
import com.h_fahmy.coin.core.domain.util.map
import com.h_fahmy.coin.crypto.data.mappers.toCoin
import com.h_fahmy.coin.crypto.data.networking.dto.CoinsResponseDto
import com.h_fahmy.coin.crypto.domain.Coin
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
    private val client: HttpClient
) : CoinDataSource {

    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            client.get(urlString = constructUrl("/assets"))
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }
}