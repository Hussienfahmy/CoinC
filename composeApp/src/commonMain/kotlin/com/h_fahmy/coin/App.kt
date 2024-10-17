package com.h_fahmy.coin

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import coinc.composeapp.generated.resources.Res
import coinc.composeapp.generated.resources.compose_multiplatform
import com.h_fahmy.coin.ui.theme.CoinCTheme

@Composable
@Preview
fun App(
    colorScheme: ColorScheme? = null
) {
    CoinCTheme(
        colorScheme = colorScheme
    ){

    }
}