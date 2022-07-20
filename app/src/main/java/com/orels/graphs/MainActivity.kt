package com.orels.graphs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.orels.graphs.model.DonutItem
import com.orels.graphs.presentation.donut.Donut
import com.orels.graphs.ui.theme.GraphsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GraphsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content()
                }
            }
        }
    }
}

@Composable
fun Content() {
    Row {
        Donut(item = DonutItem(
            title = { Text("שיחות יוצאות") },
            textInside = { Text("15") },
            innerColor = MaterialTheme.colorScheme.background,
            outerColor = MaterialTheme.colorScheme.onBackground
        ))
        Donut(item = DonutItem(
            title = { Text("שיחות נכנסות") },
            textInside = { Text("15") },
            innerColor = MaterialTheme.colorScheme.background,
            outerColor = MaterialTheme.colorScheme.onBackground
        ))
        Donut(item = DonutItem(
            title = { Text("שיחות שלא נענו") },
            textInside = { Text("15") },
            innerColor = MaterialTheme.colorScheme.background,
            outerColor = MaterialTheme.colorScheme.onBackground
        ))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GraphsTheme {

    }
}