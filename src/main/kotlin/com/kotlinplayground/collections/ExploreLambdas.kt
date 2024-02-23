package com.kotlinplayground.collections


fun calculate(x: Int, y:Int, lambdaOp: (x: Int, y:Int) -> Int) : Int {
    return lambdaOp(x, y)
}

fun main() {

    val addLambda = { x: Int -> x+x }

    val addResult = addLambda(3)
    println("AddResult: $addResult")

    val multiplyLambda = { x:Int, y:Int ->
        println("X: $x and Y: $y")
        x*y
    }
    val multiplyLambdaResult = multiplyLambda(2, 3)
    println("multiplyLambdaResult: $multiplyLambdaResult")

    val result1 = calculate(2, 3, multiplyLambda)
    println(result1)
    val result2= calculate(2, 3, { a, b -> a + b })
    println(result2)

    val result3= calculate(2, 3) { a, b -> a + b }
    println(result3)
}