package com.yasserkhayal.androidprojects.egxwatchlist.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.yasserkhayal.androidprojects.egxwatchlist.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs,
)

val interFontFamily = FontFamily(
    Font(
        googleFont = GoogleFont("Inter"),
        fontProvider = provider,
    ),
)

// Default Material 3 typography values
val baseline = Typography()

val AppTypography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = interFontFamily),
    displayMedium = baseline.displayMedium.copy(fontFamily = interFontFamily),
    displaySmall = baseline.displaySmall.copy(fontFamily = interFontFamily),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = interFontFamily),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = interFontFamily),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = interFontFamily),
    titleLarge = baseline.titleLarge.copy(fontFamily = interFontFamily),
    titleMedium = baseline.titleMedium.copy(fontFamily = interFontFamily),
    titleSmall = baseline.titleSmall.copy(fontFamily = interFontFamily),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = interFontFamily),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = interFontFamily),
    bodySmall = baseline.bodySmall.copy(fontFamily = interFontFamily),
    labelLarge = baseline.labelLarge.copy(fontFamily = interFontFamily),
    labelMedium = baseline.labelMedium.copy(fontFamily = interFontFamily),
    labelSmall = baseline.labelSmall.copy(fontFamily = interFontFamily),
)
