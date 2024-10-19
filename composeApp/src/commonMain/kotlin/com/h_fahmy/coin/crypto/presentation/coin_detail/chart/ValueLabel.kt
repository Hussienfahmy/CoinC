package com.h_fahmy.coin.crypto.presentation.coin_detail.chart

import com.h_fahmy.coin.core.presentation.util.formatFloat


data class ValueLabel(
    val value: Float,
    val unit: String
) {
    val formatted: String
        get() {
            val fractionDigits = when {
                value > 1000 -> 0
                value in 2f..999f -> 2
                else -> 3
            }

            return "${
                formatFloat(
                    value,
                    maxFractionDigits = fractionDigits,
                    minFractionDigits = 0
                )
            }$unit"
        }
}
