package com.h_fahmy.coin.core.navigation

import androidx.compose.runtime.Composable

@Composable
expect fun MyBackHandler(enabled: Boolean, onBack: () -> Unit)