package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    val isCoursePersisted : Boolean

    fun getById(id: Int) : Course

    fun save(course: Course) : Int {
        println("Save course $course")
        return course.id
    }
}

class SqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(id, "Reactive Programming in Modern Java", "Dilip")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }
}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Reactive Programming in Modern Java", "Dilip")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        println("Save NO-SQL course $course")
        return course.id
    }
}

interface A{
    fun doSomething() {
        println("Do something in A")
    }
}

interface B{
    fun doSomething() {
        println("Do something in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("do something in A and B")
    }
}

fun main() {

    val sqlCourseRepository = SqlCourseRepository()
    var course = sqlCourseRepository.getById(17)
    println(course)
    sqlCourseRepository.save(Course(35, "Reactive Programming in Modern Java", "Dilip"))

    val noSqlCourseRepository = NoSqlCourseRepository()
    var course2 = noSqlCourseRepository.getById(21)
    println(course2)
    val savedCourseId = noSqlCourseRepository.save(Course(78, "Reactive Programming in Modern Java", "Dilip"))
    println("Saved CourseId : $savedCourseId")

    val ab = AB()
    ab.doSomething()
}