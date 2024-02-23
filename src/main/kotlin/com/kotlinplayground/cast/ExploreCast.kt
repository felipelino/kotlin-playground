package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course


fun checkType(type: Any) {

    when(type) {
        is Course ->{
            // val c = type as Course
            println(type)
        }
        is String -> {
            println(type.lowercase())
        }
    }
}

fun castNumber(any: Any) {

    when(any) {
        any as? Double -> println("Value is Double")
        any as? Int -> println("Value is Int")
    }
}
fun main() {
    val course1 = Course(1, "Reactive Programming in Modern Java", "Dilip")

    checkType(course1)
    checkType("Dilip")

    castNumber(1.0)
    castNumber(1)

    val number = 1
    val numberDouble = number.toDouble()
    castNumber(numberDouble)
}


