package com.kotlinplayground.scopefunctions

import com.kotlinplayground.classes.Course
import com.kotlinplayground.classes.CourseCategory
import com.kotlinplayground.exceptions.nameLength

fun main() {

    //exploreAlso()
    //exploreLet()
    //exploreWith()
    exploreRun()
}

fun exploreRun() {
    var numbers : MutableList<Int>? = null
    var result = numbers.run {
        numbers = mutableListOf(1, 2, 3)
        numbers?.sum()
    }
    println("Result is $result")

    val length = run {
        val name = "Dilip"
        println(name)
        name.length
    }
    println(length)
}

fun exploreWith() {

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = with(numbers){
        //println("Size is ${numbers.size}")
        println("Size is ${size}")
        //val list = numbers.plus(6)
        val list = plus(6)
        list.sum()
    }
    println("Numbers $numbers")
    println("With result is $result")

}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it * 2 }.filter { it > 5 }.let {
        println(it)
        it.sum()
    }
    println("result $result")

    var name : String? = null
    name = "Dilip"
    val result1 = name?.let {
        println(it)
        it.uppercase()
    }
    println("Result1 $result1")
}


fun exploreApply() {
    val course1 = Course(
        1,
        "Design Thinking in Kotlin",
        "Dilip"
    ).apply {
        // courseCategory = CourseCategory.DESIGN
        this.courseCategory = CourseCategory.DESIGN
    }

    println("Course: $course1")

}


fun exploreAlso() {
    val course1 = Course(
        1,
        "Design Thinking in Kotlin",
        "Dilip"
    ).apply {
        // courseCategory = CourseCategory.DESIGN
        this.courseCategory = CourseCategory.DESIGN
    }.also {
        //it.courseCategory = CourseCategory.DESIGN
        println("Course: $it")
    }

}
