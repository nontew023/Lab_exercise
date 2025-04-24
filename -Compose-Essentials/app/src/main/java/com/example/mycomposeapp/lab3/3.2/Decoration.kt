package com.example.mycomposelabs

data class Decoration(val rocks: String)

// Main test functions
fun makeFish() {
    val pleco = Plecostomus()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()

    val shark = Shark()
    println("Shark: ${shark.color}")
    shark.eat()
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    val decoration3 = Decoration("slate")
    println(decoration2)
    println(decoration3)

    println(decoration1 == decoration2)  // false
    println(decoration3 == decoration2)  // true

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}