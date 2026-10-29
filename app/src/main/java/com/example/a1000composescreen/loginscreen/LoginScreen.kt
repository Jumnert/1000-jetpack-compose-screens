package com.example.a1000composescreen.loginscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen

class LoginScreen: Screen{
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Complete your free \n account setup",
                modifier = Modifier.align(Alignment.CenterVertically as Alignment.Horizontal),
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium
            )

        }
    }
}

@Preview
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}