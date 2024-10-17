package com.h_fahmy.coin.crypto.presentation.coin_list

import com.h_fahmy.coin.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
    data object Retry: CoinListAction
}