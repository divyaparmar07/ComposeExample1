package com.example.composeexample1

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class textViewModel : ViewModel() {

    private val _name = mutableStateOf("")
    val name: State<String> = _name

        fun textChanged(text: String) {
            _name.value = text
        }
}