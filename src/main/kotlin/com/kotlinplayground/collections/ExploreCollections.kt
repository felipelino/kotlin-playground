package com.kotlinplayground.collections

fun main() {

    val names = listOf("Alex", "Ben", "Chloe")
    println("Names: $names")

    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("namesMutableList: $namesMutableList")
    namesMutableList.add("Adam")
    println("namesMutableList after: $namesMutableList")

    val set = setOf("Alex", "Ben", "Chloe")
    println("Set: $set")

    val mutablesSet = mutableSetOf("Alex", "Ben", "Chloe")
    mutablesSet.add("Adam")
    println("mutablesSet: $mutablesSet")

    val nameAgeMap = mapOf("Dilip" to 34 , "Scooby" to 4)
    println("NameAgeMap $nameAgeMap")

    val nameAgeMutableMap = mutableMapOf("Dilip" to 34 , "Scooby" to 4)
    println("nameAgeMutableMap $nameAgeMutableMap")
    nameAgeMutableMap.put("abc", 100)
    nameAgeMutableMap["test"] = 59
    println("nameAgeMutableMap $nameAgeMutableMap")

}