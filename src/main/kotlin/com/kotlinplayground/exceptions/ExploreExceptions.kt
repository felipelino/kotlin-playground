package com.kotlinplayground.exceptions

import java.lang.Exception
import java.lang.RuntimeException

fun main() {
    println("Name lentgth is ${nameLength("Dilip")}")
    println("Name lentgth is ${nameLength(null)}")
    returnNothing()
}

fun returnNothing() : Nothing{
    throw RuntimeException("Exception")
}

fun nameLength(name : String?) : Int? {
    val result = try {
        name!!.length
    }
    catch (ex: Exception){
        println("Exception is $ex")
        null
    }
    return result
}
