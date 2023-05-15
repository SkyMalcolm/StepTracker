package com.example.steptracker

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import com.example.steptracker.screens.StepTrackerScreen
import com.example.steptracker.ui.theme.StepTrackerTheme
class MainActivity : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StepTrackerTheme {
                StepTrackerScreen()
            }
        }
    }
}
