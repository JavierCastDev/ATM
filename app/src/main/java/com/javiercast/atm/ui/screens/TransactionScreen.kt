package com.javiercast.atm.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.javiercast.atm.ui.components.DisplayPanel
import com.javiercast.atm.ui.components.NumberButton

@Preview
@Composable

fun MyTransactionScreen() {
    TransactionScreen()
}

@Composable
fun TransactionScreen() {
    Box() {
        Column() {
            Row(modifier = Modifier.weight(2f)) {
                DisplayPanel(
                    date = "TODO()",
                    hour = "TODO()",
                    user = "TODO()",
                    quantity = 100.00,
                    balanceAfterOperation = 150.00
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color.LightGray),
                Arrangement.Absolute.SpaceEvenly, Alignment.CenterVertically
            ) {
                NumberButton(1)
                NumberButton(2)
                NumberButton(3)
            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color.LightGray),
                Arrangement.Absolute.SpaceEvenly, Alignment.CenterVertically
            ) {
                NumberButton(4)
                NumberButton(5)
                NumberButton(6)
            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color.LightGray),
                Arrangement.Absolute.SpaceEvenly, Alignment.CenterVertically
            ) {
                NumberButton(7)
                NumberButton(8)
                NumberButton(9)
            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(Color.LightGray),
                Arrangement.Absolute.SpaceEvenly, Alignment.CenterVertically
            ) {
                NumberButton(0)
                NumberButton(0)
                NumberButton(0)
            }
        }
    }
}