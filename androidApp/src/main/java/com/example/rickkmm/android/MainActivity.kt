package com.example.rickkmm.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rickkmm.Greeting
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    private val presenter: GreetPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingView(text = presenter.print() + "TESTTTTT")
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}
