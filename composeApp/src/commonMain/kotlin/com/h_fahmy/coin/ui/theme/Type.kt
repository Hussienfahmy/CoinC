package com.h_fahmy.coin.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import coinc.composeapp.generated.resources.Res
import coinc.composeapp.generated.resources.space_mono_bold
import coinc.composeapp.generated.resources.space_mono_bold_italic
import coinc.composeapp.generated.resources.space_mono_italic
import coinc.composeapp.generated.resources.space_mono_regular
import org.jetbrains.compose.resources.Font

@Composable
fun SpaceMono() = FontFamily(
    Font(
        resource = Res.font.space_mono_regular,
        weight = FontWeight.Normal
    ),
    Font(
        resource = Res.font.space_mono_italic,
        weight = FontWeight.Normal,
        style = FontStyle.Italic
    ),
    Font(
        resource = Res.font.space_mono_bold,
        weight = FontWeight.Bold
    ),
    Font(
        resource = Res.font.space_mono_bold_italic,
        weight = FontWeight.Bold,
        style = FontStyle.Italic
    ),
)

@Composable
fun Typography() = Typography(
    bodySmall = TextStyle(
        fontFamily = SpaceMono(),
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = SpaceMono(),
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = SpaceMono(),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    labelMedium = TextStyle(
        fontFamily = SpaceMono(),
        fontWeight = FontWeight.Normal,
    ),
    headlineMedium = TextStyle(
        fontFamily = SpaceMono(),
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)