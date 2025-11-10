package com.example.thirtydaysapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydaysapp.ui.theme.ThirtyDaysAppTheme

//Represents an item with a tip
@Composable
fun TipCard(
    languageContainer: LanguageContainer,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Column(
            modifier = Modifier
                .padding(4.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(4.dp)
                .fillMaxWidth()) {
                Text("${LanguageContainer.languages.indexOf(languageContainer) + 1}. " +
                        stringResource(languageContainer.name),
                    style = MaterialTheme.typography.labelSmall
                )
                if(languageContainer.logo != null){
                    Spacer(modifier = Modifier
                        .weight(1f))
                    Image(
                        painter = painterResource(languageContainer.logo),
                        contentDescription = stringResource(R.string.logo_descriptor) +
                                stringResource(languageContainer.name),
                        modifier = Modifier
                            .height(36.dp)
                    )
                }
            }
            Text(
                stringResource(languageContainer.description),
                modifier = Modifier
                    .padding(4.dp),
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                stringResource(R.string.coding_sample),
                modifier = Modifier
                    .padding(4.dp),
                style = MaterialTheme.typography.labelSmall
            )
            Text(
                stringResource(languageContainer.codeSampleText),
                modifier = Modifier
                    .padding(4.dp),
                style = MaterialTheme.typography.bodySmall
            )
            Image(
                painter = painterResource(languageContainer.codeSample),
                contentDescription = stringResource(languageContainer.codeSampleDescription),
                modifier = Modifier.fillMaxWidth()
                    .padding(4.dp)
            )
        }
    }
}

@Composable
@Preview
fun TipCardPreview(){
    ThirtyDaysAppTheme(darkTheme = false) {
        TipCard(
            languageContainer = LanguageContainer.languages.elementAt(14)
        )
    }
}

@Composable
@Preview
fun TipCardPreviewDark(){
    ThirtyDaysAppTheme(darkTheme = true) {
        TipCard(
            languageContainer = LanguageContainer.languages.elementAt(12)
        )
    }
}