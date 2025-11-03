package com.example.thirtydaysapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Container for a daily tip

@Composable
fun Tip(
    @StringRes title: Int,
    @DrawableRes image: Int,
    @StringRes caption: Int,
    modifier: Modifier = Modifier
){
    Card(
        elevation = CardDefaults.cardElevation(3.dp),
        modifier = Modifier
            .fillMaxWidth()
    ){
        Column {
            Text(
                text = stringResource(title),
                modifier = Modifier
                    .padding(4.dp)
            )
            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier
                    .aspectRatio(1f)
                    .padding(vertical = 4.dp)
            )
            Text(
                text = stringResource(caption),
                modifier = Modifier
                    .padding(4.dp)
            )
        }
    }
}

 @Preview
 @Composable
fun TipPreview(){
    Tip(
        title = R.string.test_caption,
        image = R.drawable.ic_launcher_background,
        caption = R.string.test_caption
    )
}