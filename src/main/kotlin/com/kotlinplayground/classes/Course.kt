@file:JvmName("CourseUtils")
package com.kotlinplayground.classes

import com.kotlinplayground.CourseJava

data class Course @JvmOverloads constructor(
    val id: Int,
    val name: String,
    val author : String?,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)
{
    @JvmField
    var noOfCourses = 10
    companion object {
        @JvmStatic
        fun printName2(name :String = "default") {
            println("name: $name")
        }
    }
}

enum class CourseCategory{
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

@JvmName("printName1")
@JvmOverloads
fun printName(name :String = "default") {
    println("name: $name")
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

    val courseJava = CourseJava(7, "Reactive Programming in Modern Java", "Dilip")
    println("CourseJava: $courseJava")
    courseJava.id = 3
    courseJava.name = "other name"
    println("CourseJava: $courseJava")
}