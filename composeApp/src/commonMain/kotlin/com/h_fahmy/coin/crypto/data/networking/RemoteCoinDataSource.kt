package com.h_fahmy.coin.crypto.data.networking

import com.h_fahmy.coin.core.data.networking.constructUrl
import com.h_fahmy.coin.core.data.networking.safeCall
import com.h_fahmy.coin.core.domain.CoinDataSource
import com.h_fahmy.coin.core.domain.util.NetworkError
import com.h_fahmy.coin.core.domain.util.Result
import com.h_fahmy.coin.core.domain.util.map
import com.h_fahmy.coin.crypto.data.mappers.toCoin
import com.h_fahmy.coin.crypto.data.mappers.toCoinPrice
import com.h_fahmy.coin.crypto.data.networking.dto.CoinHistoryDto
import com.h_fahmy.coin.crypto.data.networking.dto.CoinsResponseDto
import com.h_fahmy.coin.crypto.domain.Coin
import com.h_fahmy.coin.crypto.domain.CoinPrice
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant

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

    override suspend fun getCoinHistory(
        coinId: String,
        start: LocalDateTime,
        end: LocalDateTime
    ): Result<List<CoinPrice>, NetworkError> {
        val startMillis = start.toInstant(TimeZone.UTC)
            .toEpochMilliseconds()

        val endMillis = end.toInstant(TimeZone.UTC)
            .toEpochMilliseconds()

        return safeCall<CoinHistoryDto> {
            client.get(urlString = constructUrl("/assets/$coinId/history")) {
                parameter("interval", "h6")
                parameter("start", startMillis)
                parameter("end", endMillis)
            }
        }.map { response ->
            response.data.map {
                it.toCoinPrice()
            }
        }
    }
}