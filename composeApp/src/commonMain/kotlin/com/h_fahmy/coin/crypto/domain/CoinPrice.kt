package com.h_fahmy.coin.crypto.domain

import kotlinx.datetime.LocalDateTime


data class CoinPrice(
    val priceUsd: Double,
    val dateTime: LocalDateTime
)