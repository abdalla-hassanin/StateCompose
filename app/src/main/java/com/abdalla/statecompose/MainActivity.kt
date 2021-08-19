package com.abdalla.statecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.abdalla.statecompose.ui.theme.StateComposeTheme
import androidx.compose.runtime.getValue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateComposeTheme {
                Column(
                    Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    //No State
//                    ClickCounter()


//Remember
//                    ClickCounter()


//RememberSaveable
//                    ClickCounter()


//                    State Hoisting
//                    var clicks by rememberSaveable { mutableStateOf(0) }
//                    ClickCounter(clicks) { clicks++ }
//                    Text(text = "$clicks")

//ViewModel
//                    val viewModel: ClickCounterViewModel = viewModel()
//                    val clicks by viewModel.clicks.collectAsState()
//                    ClickCounter(clicks) { viewModel.onClicksChange(it) }
//                    Text(text = "$clicks")

                }
            }
        }
    }
}
////No State
//@Composable
//fun ClickCounter() {
//    var clicks = 0
//    Button(onClick = { clicks++ })
//    {
//        Text(text = "Clicked $clicks times")
//    }
//}

////Remember
//@Composable
//fun ClickCounter() {
//    var clicks by remember { mutableStateOf(0) }
//    Button(onClick = { clicks++ })
//    {
//        Text(text = "Clicked $clicks times")
//    }
//}


////RememberSaveable
//@Composable
//fun ClickCounter() {
//    var clicks by rememberSaveable { mutableStateOf(0) }
//    Button(onClick = { clicks++ })
//    {
//        Text(text = "Clicked $clicks times")
//    }
//}


////State Hoisting
//@Composable
//fun ClickCounter(clicks: Int, onClicksChange: (Int) -> Unit) {
//
//    Button(onClick = { onClicksChange(clicks) })
//    {
//        Text(text = "Clicked $clicks times")
//    }
//}


////ViewModel
//@Composable
//fun ClickCounter(clicks: Int, onClicksChange: (Int) -> Unit) {
//
//    Button(onClick = { onClicksChange(clicks) })
//    {
//        Text(text = "Clicked $clicks times")
//    }
//}
//
//
//class ClickCounterViewModel : ViewModel() {
//
//    private val _clicks = MutableStateFlow(0)
//    val clicks: StateFlow<Int> = _clicks.asStateFlow()
//
//    fun onClicksChange(newClicks: Int) {
//        _clicks.value = newClicks + 1
//    }
//}



