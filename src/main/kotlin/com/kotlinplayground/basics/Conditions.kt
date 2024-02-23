package com.kotlinplayground.basics

fun main(){
    // if-else
    // when

    var name = "Alex"
    name = "Chloe"
    val result = if (name.length == 4) {
        println("Name is four chars")
        "Name is $name and length is ${name.length}"
    }
    else {
        println("Name is not four chars")
        "Name is $name and length is ${name.length}"
    }
    println("Result: $result")

    var position = 1
    position = 2
    val medal = if (position == 1) {
        "GOLD"
    }
    else if (position == 2) {
        "SILVER"
    }
    else if (position == 3){
        "BRONZE"
    }
    else {
        "NO MEDAL"
    }

    println(medal)

    position = 3
    val medal2 = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> { "BRONZE" }
        else -> "NO MEDAL"
    }
    println(medal2)
}