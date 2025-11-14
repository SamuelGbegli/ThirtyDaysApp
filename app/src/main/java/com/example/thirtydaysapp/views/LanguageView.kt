package com.example.thirtydaysapp.views

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydaysapp.LanguageContainer
import com.example.thirtydaysapp.R
import com.example.thirtydaysapp.data.DataSource
import com.example.thirtydaysapp.ui.theme.ThirtyDaysAppTheme

@Composable
fun LanguageView(
    selectedLanguage: LanguageContainer?,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
            .padding(8.dp)
            .verticalScroll(rememberScrollState())
    ) {
        if(selectedLanguage != null){
            Text(
                stringResource(selectedLanguage.name),
                style = MaterialTheme.typography.displayLarge,
                modifier = modifier
            )
            if(selectedLanguage.logo != null) {
                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .size(140.dp)
                        .padding(horizontal = 20.dp),
                    contentAlignment = Alignment.Center
                )

                {
                    Image(
                        painter = painterResource(selectedLanguage.logo),
                        contentDescription = stringResource(R.string.logo_descriptor) +
                                stringResource(selectedLanguage.name),
                        alignment = Alignment.Center,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
            Text(
                stringResource(selectedLanguage.description),
                style = MaterialTheme.typography.displayMedium,
                modifier = modifier
            )
            Text(
                stringResource(R.string.coding_sample),
                style = MaterialTheme.typography.displayLarge,
                modifier = modifier
            )
            Text(
                stringResource(selectedLanguage.codeSampleText),
                style = MaterialTheme.typography.displayMedium,
                modifier = modifier
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ){
                Image(
                    painter = painterResource(selectedLanguage.codeSample),
                    contentDescription = stringResource(selectedLanguage.codeSampleDescription),
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Composable
@Preview
fun LanguageViewPreview(){
    ThirtyDaysAppTheme {
        Surface {
            LanguageView(
                selectedLanguage = DataSource.languages[4],
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
@Preview
fun LanguageViewDarkPreview(){
    ThirtyDaysAppTheme(darkTheme = true) {
        Surface {
            LanguageView(
                selectedLanguage = DataSource.languages[19],
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}