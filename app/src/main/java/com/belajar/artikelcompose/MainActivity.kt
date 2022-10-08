package com.belajar.artikelcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.belajar.artikelcompose.ui.theme.ArtikelComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtikelComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(text = stringResource(id = R.string.title_artikel),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(text = stringResource(id = R.string.artikel_first_par),
            modifier = Modifier.padding(16.dp,0.dp,16.dp,0.dp),
            textAlign = TextAlign.Justify
        )
        Text(text = stringResource(id = R.string.artikel_second_par),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify)

    }
}

@Preview(showBackground = true, name = "Artikel Compose", showSystemUi = true)
@Composable
fun ArtikelComposePreview() {
    ArtikelComposeTheme {
        Greeting()
    }
}