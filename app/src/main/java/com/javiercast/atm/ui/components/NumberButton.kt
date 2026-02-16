package com.javiercast.atm.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable

fun MyNumberButon() {
    NumberButton(2)
}

@Composable

fun NumberButton(number: Int) {

    Button(
        modifier = Modifier.size(75.dp), shape = CircleShape, border = BorderStroke(3.dp, Color.Black),
        contentPadding = PaddingValues(0.dp),
        elevation = ButtonDefaults.buttonElevation(20.dp, 2.dp, 2.dp, 6.dp, 0.dp),
        onClick = {

        }
    ) {
        Text("$number")
    }
}