package com.orels.graphs.presentation.donut

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DonutViewModel(): ViewModel() {
    val state by mutableStateOf(DonutState())

}