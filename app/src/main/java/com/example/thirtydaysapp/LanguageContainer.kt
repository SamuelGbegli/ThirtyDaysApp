package com.example.thirtydaysapp

import androidx.lifecycle.ViewModel
import com.example.thirtydaysapp.data.LanguageUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

//Stores information about a programming language
class LanguageContainer(
    //The name of the programming language
    val name: Int,
    //The programming language's logo
    val logo: Int?,
    //A summary of the language
    val description: Int,
    //An image with sample code of the programming language
    val codeSample: Int,
    //Text explaining what the sample code does
    val codeSampleText: Int,
    //A description of the sample code image
    val codeSampleDescription: Int,
)

/**
 * Holds information about a language selected by the user
 */
class LanguageViewModel : ViewModel() {

    //Stores state
    private val _uiState = MutableStateFlow(LanguageUiState())
    val uiState: StateFlow<LanguageUiState> = _uiState.asStateFlow()

    /**
     * Sets the viewable language based on user input
     */
    fun setLanguage(newLanguageContainer: LanguageContainer){
        _uiState.update { currentState ->
            currentState.copy(
                selectedLanguage = newLanguageContainer
            )
        }
    }
}