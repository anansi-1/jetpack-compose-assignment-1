package com.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.jetpack_compose_assignment_1.data.getSampleCourses
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme
import com.example.jetpack_compose_assignment_1.ui.theme.components.TopBarComponent
import com.example.jetpack_compose_assignment_1.ui.theme.screens.CourseListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            Jetpackcomposeassignment1Theme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .systemBarsPadding(),
                    color = Color(0xFFEEECEC)
                ) {
                    Column {
                        TopBarComponent(text = "Course List")
                        CourseListScreen(courses = getSampleCourses())
                    }
                }
            }
        }

    }
}
