package com.h_fahmy.coin.core.presentation.util

import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.round

fun formatFloat(value: Float, minFractionDigits: Int, maxFractionDigits: Int): String {
    val integerPart = floor(value).toLong()
    val fractionMultiplier = 10.0.pow(maxFractionDigits).toFloat()
    val fractionalPart = round((value - integerPart) * fractionMultiplier).toLong()

    val integerFormatted = integerPart.toString().reversed().chunked(3).joinToString(",").reversed()

    val fractionalFormatted = fractionalPart.toString().padStart(maxFractionDigits, '0')

    val fractionalFinal = if (minFractionDigits == 0) {
        ""
    } else {
        fractionalFormatted.trimEnd('0').padEnd(minFractionDigits, '0')
    }

    return if (fractionalFinal.isEmpty()) integerFormatted else "$integerFormatted.$fractionalFinal"
}