package com.h_fahmy.coin.di

import com.h_fahmy.coin.core.data.networking.HttpClientFactory
import com.h_fahmy.coin.core.domain.CoinDataSource
import com.h_fahmy.coin.crypto.data.networking.RemoteCoinDataSource
import com.h_fahmy.coin.crypto.presentation.coin_list.CoinListViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create() }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()
    viewModelOf(::CoinListViewModel)
}