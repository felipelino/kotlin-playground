package com.kotlinplayground.classes

data class Employee(
    var Id: Int,
    var name : String
)

fun main() {

    val emp1 = Employee(1, "John")
    println(emp1)

    val emp2 = Employee(1, "John")
    println("${emp1 == emp2}")

    val emp3 = emp1.copy(2, "Mary")
    println(emp3)
}