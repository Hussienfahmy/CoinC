package com.h_fahmy.coin

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.h_fahmy.coin.crypto.presentation.coin_list.CoinListScreen
import com.h_fahmy.coin.crypto.presentation.coin_list.CoinListViewModel
import com.h_fahmy.coin.ui.theme.CoinCTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App(
    colorScheme: ColorScheme? = null
) {
    CoinCTheme(
        colorScheme = colorScheme
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
        ) { innerPadding ->
            val viewModel = koinViewModel<CoinListViewModel>()
            val state by viewModel.state.collectAsStateWithLifecycle()

            CoinListScreen(
                modifier = Modifier.padding(innerPadding),
                state = state,
            )
        }
    }
}