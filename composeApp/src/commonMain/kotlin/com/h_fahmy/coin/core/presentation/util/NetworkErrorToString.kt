package com.h_fahmy.coin.core.presentation.util

import coinc.composeapp.generated.resources.Res
import coinc.composeapp.generated.resources.error_no_internet
import coinc.composeapp.generated.resources.error_request_timeout
import coinc.composeapp.generated.resources.error_serialization
import coinc.composeapp.generated.resources.error_too_many_requests
import coinc.composeapp.generated.resources.error_unknown
import com.h_fahmy.coin.core.domain.util.NetworkError
import org.jetbrains.compose.resources.getString

suspend fun NetworkError.string(): String {
    val resource = when (this) {
        NetworkError.REQUEST_TIMEOUT -> Res.string.error_request_timeout
        NetworkError.TOO_MANY_REQUESTS -> Res.string.error_too_many_requests
        NetworkError.NO_INTERNET -> Res.string.error_no_internet
        NetworkError.SERVER_ERROR -> Res.string.error_unknown
        NetworkError.SERIALIZATION -> Res.string.error_serialization
        NetworkError.UNKNOWN -> Res.string.error_unknown
    }

    return getString(resource)
}