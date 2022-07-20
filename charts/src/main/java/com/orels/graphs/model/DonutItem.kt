package com.orels.graphs.model

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class DonutItem(
    val title: @Composable ColumnScope.() -> Unit,
    val textInside: @Composable BoxScope.() -> Unit,
    val outerSize: Float = 100f,
    val innerSize: Float = 80f,
    val outerColor: Color = Color.Red,
    val innerColor: Color = Color.White,
) {

}