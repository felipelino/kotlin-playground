package com.kotlinplayground.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {

    var email : String = ""
    var nameLength : Int = 0

    init{
        nameLength = name.length
    }

    constructor(_email : String): this(_email, "", 0) {
    }

    constructor(_email : String, _name: String = "", _age : Int = 0): this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val person = Person("John", 25)
    person.action()

    println("Name: ${person.name} and age is ${person.age}")

    val person2 = Person()
    println("Name: ${person2.name} and age is ${person2.age}")

    val person3 = Person(_email = "test@gmail.com", "Alex", 35)
    println("Name: ${person3.name} and age is ${person3.age} and email is ${person3.email} and NameLength: ${person3.nameLength}")
}
