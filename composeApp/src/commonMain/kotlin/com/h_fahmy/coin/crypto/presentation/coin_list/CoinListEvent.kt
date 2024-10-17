package com.h_fahmy.coin.crypto.presentation.coin_list

import com.h_fahmy.coin.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}