package com.kotlinplayground.classes

object Authenticate {

    fun authenticate(userName :String, password: String) {
        println("User authenticate for username: $userName")
    }
}

fun main() {
    Authenticate.authenticate("John" , "123456")

}