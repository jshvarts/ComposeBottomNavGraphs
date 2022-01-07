package com.jshvarts.composebottomnavgraphs.screens


import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.jshvarts.composebottomnavgraphs.R
import com.jshvarts.composebottomnavgraphs.ui.theme.ComposeBottomNavGraphsTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Surface(color = MaterialTheme.colors.background) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = stringResource(id = R.string.screen_title_home)) }
                )
            }
        ) {
            Box(
                modifier = modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(id = R.string.screen_title_home),
                    style = MaterialTheme.typography.h2
                )
            }
        }
    }
}

@Preview(name = "Day Mode", uiMode = UI_MODE_NIGHT_NO)
@Preview(name = "Night Mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun HomeScreenPreview() {
    ComposeBottomNavGraphsTheme {
        HomeScreen()
    }
}