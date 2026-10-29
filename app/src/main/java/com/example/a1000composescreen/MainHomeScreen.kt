package com.example.a1000composescreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.a1000composescreen.loginscreen.LoginScreen

object MainHomeScreen: Screen{
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        LazyColumn() {
            items(practiceScreens){ item ->
                Text(
                    text = item.title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable{ navigator.push(item.create())}
                )

            }
        }
    }
}

data class practiceItem(
    val title: String,
    val create: () -> Screen
)

val practiceScreens = listOf(
    practiceItem("LoginScreen"){LoginScreen()}
)

