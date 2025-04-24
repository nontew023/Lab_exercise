package com.example.mycomposelabs

fun makeFish() {
    val pleco = Plecostomus()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()

    val shark = Shark()
    println("Shark: ${shark.color}")
    shark.eat()
}

fun main() {
    makeFish()
}
