package com.h_fahmy.coin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform