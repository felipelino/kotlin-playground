package com.kotlinplayground.nulls

data class Movie(
    val id: Int?,
    val name: String
)

fun printName(name :String) {
    println("Name is $name")
}

fun printName1(name :String?) {
    println("Name is $name")
}

fun main() {
    var nameNullable : String? = null

    //printName(nameNullable!!)
    nameNullable?.run {
        printName(this)
    }
    println("Value is : ${nameNullable?.length}" ) // ? safe operator
    //nameNullable = "Alex"
    val length = nameNullable?.length?.toLong()?:0 // Elvis operator
    println("Length: $length")

    nameNullable = "Dilip"
    printName1(nameNullable)
    println("Value is : $nameNullable" )

    var name : String = "Dilip"
    println("Name is : $nameNullable" )

    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!)
}

fun saveMovie(movie: Movie) : Movie {
    return movie.copy(id = 1)
    //return movie
}
