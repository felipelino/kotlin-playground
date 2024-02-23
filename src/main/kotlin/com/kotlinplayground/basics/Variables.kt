package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {

    val name : String = "Dilip"

    println(name)

    var age : Int = 34
    println(age)

    age = 35
    println(age)

    var salary = 30000L // variable inference
    println(salary)

    var course = "Kotlin Spring"
    println("course : $course and the course length is ${course.length}") // String interpolation

    var multiline0 = "ABC \n DEF"
    println(multiline0)

    var multiline1 = """
        ABC
        DEF
        {
           "field" :{
                "a" : $course
           }
        }
    """.trimIndent()
    println(multiline1)

    val num = topLevelFunction()
    println("Num is $num")

    println("Course name is $courseName")
}