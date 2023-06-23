package io.github.ruattd.mclv

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import io.github.ruattd.mclv.ui.Bootstrap
import kotlin.system.exitProcess

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Bootstrap()
    }
}

fun onCloseRequest() {
    exitProcess(0)
}

fun main(args: Array<String>) {
    application {
        Window(
            onCloseRequest = ::onCloseRequest,
            title = "Minecraft Log Viewer",
            state = WindowState(
                size = DpSize(width = 720.dp, height = 480.dp),
            ),
            icon = painterResource("assets/book.png"),
        ) {
            App()
        }
    }
}
