package com.example.thirtydaysapp.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydaysapp.composables.CardButton
import com.example.thirtydaysapp.LanguageContainer
import com.example.thirtydaysapp.data.DataSource
import com.example.thirtydaysapp.ui.theme.ThirtyDaysAppTheme

@Composable
fun HomeView(
    onItemClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    LazyColumn(
        contentPadding = PaddingValues(4.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        items(DataSource.languages) { item ->
            CardButton(
                text = item.name,
                image = item.logo,
                onClick = {
                    onItemClicked()
                }
            )
        }
    }
}

@Composable
fun HomeGridView(
    onItemClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        items(DataSource.languages) { item ->
            CardButton(
                text = item.name,
                image = item.logo,
                onClick = {
                    onItemClicked(DataSource.languages.indexOf(item))
                }
            )
        }
    }
}

@Composable
@Preview
fun HomeViewPreview(){
    ThirtyDaysAppTheme {
        HomeView(
            onItemClicked = {

            }
        )
    }
}

@Composable
@Preview
fun HomeGridViewPreview(){
    ThirtyDaysAppTheme(darkTheme = true) {
        HomeGridView(
            onItemClicked = {

            }
        )
    }
}