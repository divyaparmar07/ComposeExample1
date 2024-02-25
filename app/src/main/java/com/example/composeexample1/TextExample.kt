package com.example.composeexample1

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextChanged(viewModel: textViewModel = androidx.lifecycle.viewmodel.compose.viewModel())
{
    Text(
        text = viewModel.name.value,
        modifier = Modifier.padding(10.dp),
        fontSize = 22.sp,
    )
}