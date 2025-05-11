package com.example.jetpack_compose_assignment_1.ui.theme.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_assignment_1.Course
import com.example.jetpack_compose_assignment_1.ui.theme.components.CourseCard

@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn {
        items(courses) { course ->
            CourseCard(course = course)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun CourseListScreenPreview() {
    val sampleCourses = listOf(
        Course(
            title = "Mobile Application Development",
            code = "SECT3132",
            credit = 3,
            description = "Developing apps for Android and iOS.",
            prerequisites = "Intro to Programming"
        ),
        Course(
            title = "Computer Graphics",
            code = "SECT3151",
            credit = 4,
            description = "Introduction to 2D/3D graphics.",
            prerequisites = "Mathematics for CS"
        )
    )
    CourseListScreen(courses = sampleCourses)
}
