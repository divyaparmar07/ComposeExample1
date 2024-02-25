package com.example.composeexample1

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginExample(viewModel: textViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {

//    var text1 by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Row() {
            Text(text = "Name:", modifier = Modifier.padding(top = 10.dp), fontSize = 22.sp)
            TextField(value = viewModel.name.value,
                onValueChange = { viewModel.textChanged(it) })
        }
        Text(
            text = viewModel.name.value,
            modifier = Modifier.padding(10.dp),
            fontSize = 22.sp,
            )
        Button(
            onClick = { }) {
            Text(text = "Submit")
        }
        Button(onClick = { }) {
            Text(text = "Clear")
        }
    }
}
