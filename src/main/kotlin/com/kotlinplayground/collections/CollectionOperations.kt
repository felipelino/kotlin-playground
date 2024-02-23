package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.KAFKA
import com.kotlinplayground.dataset.courseList

val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT}
val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN}


fun main() {

    val courseList = courseList()


    val listOfLists = listOf(listOf(1,2,3), listOf(4,5,6))
    val mapResult = listOfLists.map { insideList ->
        insideList.map {
            it.toDouble()
        }
    }
    println("MapResult: $mapResult")

    val flatMapResult = listOfLists.flatMap { insideList ->
        insideList.map {
            it.toDouble()
        }
    }
    println("flatMapResult: $flatMapResult")


    //exploreFilter(courseList, devPredicate)
    //exploreFilter(courseList, desPredicate)
    //exploreMap(courseList, desPredicate)

    //val courses = exploreFlatMap(courseList, KAFKA)
    //println("Kafka Courses: $courses")

    //exploreHashMap()

    collections_nullability()
}

fun collections_nullability() {

    var list : MutableList<String>? = null
    list = mutableListOf()

    list?.add("Dilip")
    list?.forEach {
        println("Value is $it")
    }

    val list1 : List<String?> = listOf("Adam", null, "Alex")
    list1.forEach {
        println("Value length is ${it?.length}")
    }
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Dilip" to 33, "Scooby" to 5)
    nameAgeMutableMap
        .forEach { (k, v)->
            println("Key: $k and the value is $v")
        }

    val value = nameAgeMutableMap.get("Dilip")
    println(value)
    println(nameAgeMutableMap["Scooby"])

    val valueNotExist = nameAgeMutableMap.getOrElse("Dilip1") {"abc"}
    println(valueNotExist)

    println(nameAgeMutableMap.containsKey("Dilip"))

    val resultFilteredMap =  nameAgeMutableMap.filterKeys { it.length > 5 }
        .map { it.key.uppercase() }
    println("FilteredMep $resultFilteredMap")

    val entryMaxAge = nameAgeMutableMap.maxByOrNull {  it.value  }
    println("entryMaxAge: $entryMaxAge")
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String) : List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
                it == kafka
            }.map {
                courseName
            }
    }
    return kafkaCourses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courseNames = courseList
        .filter(predicate)
        .map { "{$it.name} - ${it.category}" }
        .forEach({
            println("$it")
        })

    println("Courses: $courseNames")
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate : (Course) -> Boolean
) {
    val developmentCourses = courseList
        // filter {it.category == CourseCategory.DEVELOPEMENT}
        .filter { predicate.invoke(it) }
        .forEach {
            println("$it")
        }
}
