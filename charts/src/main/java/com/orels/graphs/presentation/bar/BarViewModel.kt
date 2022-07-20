package com.orels.graphs.presentation.bar

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class BarViewModel(): ViewModel() {
    val state by mutableStateOf(BarState())

}