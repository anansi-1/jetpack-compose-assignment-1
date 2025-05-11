package com.example.jetpack_compose_assignment_1.data

import com.example.jetpack_compose_assignment_1.Course

fun getSampleCourses(): List<Course> {
    return listOf(
        Course(
            title = "Mobile Application Development",
            code = "SECT3132",
            credit = 3,
            description = "Focuses on developing mobile applications for iOS and Android platforms.",
            prerequisites = "Introduction to Programming"
        ),
        Course(
            title = "Computer Graphics",
            code = "SECT3151",
            credit = 4,
            description = "Introduces 2D and 3D graphics, rendering techniques, and graphical algorithms.",
            prerequisites = "Introduction to Programming, Mathematics for Computer Science"
        ),
        Course(
            title = "Fundamentals of AI",
            code = "SECT3141",
            credit = 3,
            description = "Covers the basics of Artificial Intelligence, including search algorithms, knowledge representation, and reasoning.",
            prerequisites = "Introduction to Programming, Discrete Mathematics"
        ),
        Course(
            title = "Fundamentals of Cybersecurity",
            code = "SECT3113",
            credit = 3,
            description = "Introduction to the principles of cybersecurity, including encryption, authentication, and security protocols.",
            prerequisites = "Introduction to Programming, Introduction to Computer Networks"
        ),
        Course(
            title = "Operating System and System Programming",
            code = "SECT3082",
            credit = 4,
            description = "An in-depth study of operating system concepts and system programming.",
            prerequisites = "Introduction to Programming, Computer Organization and Architecture"
        ),
        Course(
            title = "Web Development",
            code = "SECT3101",
            credit = 3,
            description = "Covers the fundamentals of front-end and back-end web development including HTML, CSS, JavaScript, and server-side scripting.",
            prerequisites = "Introduction to Programming"
        ),
        Course(
            title = "Fundamentals of Software Engineering",
            code = "SECT3092",
            credit = 3,
            description = "Introduction to software development life cycle, methodologies, requirements analysis, and software design principles.",
            prerequisites = "Introduction to Programming"
        ),
        Course(
            title = "Computer Organization and Architecture",
            code = "SECT3071",
            credit = 4,
            description = "Explores the structure and behavior of computer systems, including memory hierarchy, CPU architecture, and instruction sets.",
            prerequisites = "Introduction to Programming, Digital Logic Design"
        )
    )
}
