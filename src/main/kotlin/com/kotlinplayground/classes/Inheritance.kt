package com.kotlinplayground.classes

open class User(val name :String) {
    open var isLoggedIn : Boolean = false
    open fun login() {
        isLoggedIn = true
        println("Inside user login")
    }

    private fun secret(){
        println("My secret")
    }

    open protected fun logout(){
        println("User Logout")
    }
}

class Student(name :String ) : User(name) {
    override var isLoggedIn : Boolean = true
    override fun login() {
        super.login()
        isLoggedIn = false
        println("Inside student login")
    }

    public override fun logout(){
        super.logout()
        println("Student logout")
    }

    companion object {
        const val noOffEnrollledCourses = 10
        fun country(): String {
            return "USA"
        }
    }
}

class Instructor(name :String ) : User(name)

fun main() {

    val student = Student("Alex")
    println(student.name)
    student.login()
    student.isLoggedIn = true

    val country = Student.country()
    println("Country is $country")
    println("noOffEnrolledCourses is ${Student.noOffEnrollledCourses}")

    val instructor = Instructor("Dilip")
    println(instructor.name)
    instructor.login()

    val user = User("Dilip")
    student.logout()
}