package com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author : String?,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory{
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course1 = Course(1, "Reactive Programming in Modern Java", "Dilip")
    println(course1)

    val course2 = Course(1, "Reactive Programming in Modern Java", "Dilip")
    println("Are equals ${course1 ==course2}")

    val course3 = course1.copy(id = 3, author = "Dilip1")
    println(course3)

    val marketingCourse = Course(2, "Marketing for Facebook", null, CourseCategory.MARKETING)
    println(marketingCourse)
}