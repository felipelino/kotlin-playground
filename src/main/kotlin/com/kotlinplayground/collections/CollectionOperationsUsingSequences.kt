package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.courseList

fun main() {
    val namesListUsingSequence = listOf("alex", "ben" , "chloe")
        .asSequence()
        .filter { it.length >=4 }
        .map { it.uppercase() }
        .toList()

    println("namesListUsingSequence: $namesListUsingSequence")
    exploreFilterUsingSequence(courseList(), devPredicate)

    val range = 1 .. 1000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach({println("Value is $it")})
}

fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate : (Course) -> Boolean
) {
    val developmentCourses = courseList
        // filter {it.category == CourseCategory.DEVELOPEMENT}
        .filter { predicate.invoke(it) }
        .forEach {
            println("$it")
        }
}