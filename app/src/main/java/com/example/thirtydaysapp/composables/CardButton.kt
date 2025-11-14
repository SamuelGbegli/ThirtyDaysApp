package com.example.thirtydaysapp.composables

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
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
import kotlin.collections.get

@Composable
fun CardButton(
    @StringRes text: Int,
    @DrawableRes image: Int?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Card(
        modifier = Modifier.fillMaxWidth()
            .clickable(
                onClick = {
                    onClick()
                }
            ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp)
                .size(84.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                stringResource(text),
                style = MaterialTheme.typography.labelSmall
            )
            if(image != null){
                Spacer(
                    modifier = Modifier
                        .weight(1f)
                )
                Image(
                    painter = painterResource(image),
                    contentDescription = "${stringResource(R.string.logo_descriptor)} " +
                            stringResource(text),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.sizeIn(maxWidth = 112.dp)
                        .size(76.dp)
                )
            }
        }
    }
}

@Composable
@Preview
fun CardButtonPreview(){
    ThirtyDaysAppTheme {
        Column {
            CardButton(
                DataSource.languages[10].name,
                DataSource.languages[10].logo,
                onClick = {

                }
            )
            Spacer(Modifier.padding(8.dp))
            CardButton(
                DataSource.languages[17].name,
                DataSource.languages[17].logo,
                onClick = {

                }
            )
        }
    }
}

@Composable
@Preview
fun CardButtonPreviewDark(){
    ThirtyDaysAppTheme(darkTheme = true) {
        Column {
            CardButton(
                DataSource.languages[14].name,
                DataSource.languages[14].logo,
                onClick = {

                }
            )
            Spacer(Modifier.padding(8.dp))
            CardButton(
                DataSource.languages[13].name,
                DataSource.languages[13].logo,
                onClick = {

                }
            )
        }
    }
}