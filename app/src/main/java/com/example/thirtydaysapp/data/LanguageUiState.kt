package com.example.thirtydaysapp.data

import com.example.thirtydaysapp.LanguageContainer

/**
 * Data class for representing the current UI in terms of the language selected by the user.
 */

data class LanguageUiState (
    val selectedLanguage: LanguageContainer? = null
)