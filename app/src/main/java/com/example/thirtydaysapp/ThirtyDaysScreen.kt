package com.example.thirtydaysapp

import android.annotation.SuppressLint
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.currentBackStackEntryAsState
import  androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.thirtydaysapp.LanguageViewModel
import com.example.thirtydaysapp.data.DataSource
import com.example.thirtydaysapp.views.HomeGridView
import com.example.thirtydaysapp.views.LanguageView


enum class ThirtyDaysScreen(@StringRes val title: Int) {
    Home(R.string.home),
    Summary(R.string.summary)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirtyDaysApp(
    modifier: Modifier = Modifier,
    viewModel: LanguageViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){

    var showAboutDialog by remember { mutableStateOf(false) }

    //Used to vibrate the phone when the image is tapped
    val haptic  = LocalHapticFeedback.current

    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = ThirtyDaysScreen.valueOf(
        backStackEntry?.destination?.route ?: ThirtyDaysScreen.Home.name
    )

    val layoutDirection = LocalLayoutDirection.current

    if(showAboutDialog){
        BasicAlertDialog(
            onDismissRequest = {
                showAboutDialog = false
            }
        ) {
            Surface(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                shape = MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                    Text(
                        stringResource(R.string.about_this_app),
                        style = MaterialTheme.typography.labelSmall
                    )
                    Spacer(modifier = Modifier
                        .padding(8.dp))
                    Text(
                        stringResource(R.string.app_information),
                        style = MaterialTheme.typography.bodySmall
                    )
                    Spacer(modifier = Modifier
                        .padding(8.dp))
                    Text(
                        stringResource(R.string.app_information_2),
                        style = MaterialTheme.typography.bodySmall
                    )
                    Spacer(modifier = Modifier
                        .padding(8.dp))
                    Button(
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            showAboutDialog = false
                        }
                    ) {
                        Text("Close")
                    }
                }
            }
        }
    }

    Surface {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Text(stringResource(R.string.app_title),
                            style = MaterialTheme.typography.displayLarge,)
                    },
                    navigationIcon = {
                        if(navController.previousBackStackEntry != null){
                            IconButton(onClick = {
                                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                navController.navigateUp()
                            }
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = stringResource(R.string.back)
                                )
                            }
                        }

                    },
                    actions = {
                        if(navController.previousBackStackEntry == null) {
                            IconButton(
                                onClick = {
                                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                    showAboutDialog = !showAboutDialog
                                }
                            ) {
                                Icon(
                                    Icons.Filled.Info,
                                    contentDescription = "About this app"
                                )
                            }
                        }
                    }
                )
            },
            modifier = Modifier
        ) { innerPadding ->
            val uiState by viewModel.uiState.collectAsState()

            NavHost(
                navController = navController,
                startDestination = ThirtyDaysScreen.Home.name,
                modifier = Modifier
                    .padding(innerPadding)
                    .statusBarsPadding()
                    .padding(
                        start = WindowInsets.safeDrawing.asPaddingValues()
                            .calculateStartPadding(layoutDirection),
                        end = WindowInsets.safeDrawing.asPaddingValues()
                            .calculateEndPadding(layoutDirection)
                    )
            ) {
                composable(route = ThirtyDaysScreen.Home.name) {
                    HomeGridView(
                        onItemClicked = {
                            viewModel.setLanguage(DataSource.languages[it])
                            navController.navigate(ThirtyDaysScreen.Summary.name)
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                        }
                    )
                }
                composable(route = ThirtyDaysScreen.Summary.name) {
                    LanguageView(
                        selectedLanguage = uiState.selectedLanguage
                    )
                }
            }
        }
    }
}