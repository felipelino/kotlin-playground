package com.kotlinplayground.functions

import java.time.LocalDate

// Unit same as void
fun printName(name: String) :Unit {
    println("Name is : $name")
}


fun addition(a: Int, b: Int) : Int {
    return a+b
}

// fun addition_approach1(a: Int, b: Int) : Init = a+b
fun addition_approach1(a: Int, b: Int) = a+b

fun printPersonDetails(
    name: String,
    email: String = "",
    dateOfBirth: LocalDate = LocalDate.now()
) {
    println("Name is $name and email is $email and birth on $dateOfBirth")
}

fun main() {

    printName("Dilip")
    val result = addition(1, 2)
    println("Result is $result")

    val result1 = addition_approach1(1, 2)
    println("Result is $result1")

    printPersonDetails("Dilip", "abc@gmail.com", LocalDate.parse("2000-01-01"))

    printPersonDetails(name ="Dilip", dateOfBirth = LocalDate.parse("1985-03-16"))

}



