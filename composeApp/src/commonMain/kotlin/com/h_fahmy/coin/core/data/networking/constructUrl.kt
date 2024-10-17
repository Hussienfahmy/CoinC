package com.h_fahmy.coin.core.data.networking

fun constructUrl(url: String): String {
    return when {
        url.contains(BASE_URL) -> url
        url.startsWith("/") -> BASE_URL + url.drop(1)
        else -> BASE_URL + url
    }
}

const val BASE_URL = "https://api.coincap.io/v2/"