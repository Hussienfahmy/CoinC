package com.h_fahmy.coin

import android.app.Application
import com.h_fahmy.coin.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class CoinCApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@CoinCApplication)
            androidLogger()
        }
    }
}