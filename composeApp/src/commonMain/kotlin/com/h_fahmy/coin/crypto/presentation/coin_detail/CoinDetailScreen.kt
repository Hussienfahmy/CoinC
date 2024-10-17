package com.h_fahmy.coin.crypto.presentation.coin_detail

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coinc.composeapp.generated.resources.Res
import coinc.composeapp.generated.resources.change_last_24h
import coinc.composeapp.generated.resources.dollar
import coinc.composeapp.generated.resources.market_cap
import coinc.composeapp.generated.resources.price
import coinc.composeapp.generated.resources.stock
import coinc.composeapp.generated.resources.trending
import coinc.composeapp.generated.resources.trending_down
import com.h_fahmy.coin.crypto.presentation.coin_detail.components.InfoCard
import com.h_fahmy.coin.crypto.presentation.coin_list.CoinListState
import com.h_fahmy.coin.crypto.presentation.models.toDisplayableNumber
import com.h_fahmy.coin.ui.theme.greenBackground
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CoinDetailScreen(
    modifier: Modifier = Modifier,
    state: CoinListState,
) {
    val contentColor = if (isSystemInDarkTheme()) {
        Color.White
    } else {
        Color.Black
    }
    if (state.isLoading) {
        Box(
            modifier = modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    } else if (state.selectedCoin != null) {
        val coin = state.selectedCoin
        Column(
            modifier = modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(coin.iconRes),
                contentDescription = coin.name,
                modifier = Modifier.size(100.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                text = coin.name,
                fontSize = 40.sp,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Center,
                color = contentColor
            )
            Text(
                text = coin.symbol,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                color = contentColor
            )
            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                InfoCard(
                    title = stringResource(Res.string.market_cap),
                    formattedText = "$ ${coin.marketCapUsd.formatted}",
                    painter = painterResource(Res.drawable.stock)
                )
                InfoCard(
                    title = stringResource(Res.string.price),
                    formattedText = "$ ${coin.priceUsd.formatted}",
                    painter = painterResource(Res.drawable.dollar)
                )

                val absoluteChangeFormatted =
                    (coin.priceUsd.value * (coin.changePercent24Hr.value / 100))
                        .toDisplayableNumber()
                val isPositive = coin.changePercent24Hr.value > 0.0
                val changeCardContentColor = if (isPositive) {
                    if (isSystemInDarkTheme()) Color.Green else greenBackground
                } else {
                    MaterialTheme.colorScheme.error
                }
                InfoCard(
                    title = stringResource(Res.string.change_last_24h),
                    formattedText = absoluteChangeFormatted.formatted,
                    painter = if (isPositive) {
                        painterResource(Res.drawable.trending)
                    } else {
                        painterResource(Res.drawable.trending_down)
                    },
                    contentColor = changeCardContentColor
                )
            }
        }
    }
}