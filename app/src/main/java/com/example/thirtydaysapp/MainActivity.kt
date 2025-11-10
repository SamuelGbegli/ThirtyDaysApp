package com.example.thirtydaysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirtydaysapp.ui.theme.ThirtyDaysAppTheme
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThirtyDaysAppTheme {
                ThirtyDaysApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirtyDaysApp(
    modifier: Modifier = Modifier
){
    //variable to show information dialog
    var showAboutDialog: Boolean by remember { mutableStateOf(false) }

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
                            showAboutDialog = false
                        }
                    ) {
                        Text("Close")
                    }
                }
            }
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Text(
                            "30 Days App",
                            style = MaterialTheme.typography.displayLarge
                        )
                    },
                    actions = {
                        IconButton(
                            onClick = {
                                showAboutDialog = !showAboutDialog
                            }
                        ) {
                            Icon(
                                Icons.Filled.Info,
                                contentDescription = "About this app"
                                )
                        }
                    }
                )
            },
            modifier = modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(
                    start = WindowInsets.safeDrawing.asPaddingValues()
                        .calculateStartPadding(layoutDirection)
                )
        ) { contentPadding ->
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier.padding(contentPadding),
                contentPadding = PaddingValues(4.dp),
            ) {
                items(LanguageContainer.languages) { item ->
                    TipCard(item)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ThirtyDaysAppPreview() {
    ThirtyDaysAppTheme(darkTheme = false) {
        ThirtyDaysApp()
    }
}

@Preview(showBackground = true)
@Composable
fun ThirtyDaysAppDarkPreview() {
    ThirtyDaysAppTheme(darkTheme = true) {
        ThirtyDaysApp()
    }
}