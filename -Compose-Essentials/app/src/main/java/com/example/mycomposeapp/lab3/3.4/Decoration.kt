package com.example.mycomposelabs

// Data class with a single property
data class Decoration(val rocks: String)

// Data class with three properties to demonstrate destructuring
data class Decoration2(val rocks: String, val wood: String, val diver: String)

// Function to test Decoration and Decoration2 classes
fun makeDecorations() {
    // Create and print an instance of Decoration
    val decoration1 = Decoration("granite")
    println(decoration1)  // Output: Decoration(rocks=granite)

    // Create additional Decoration instances
    val decoration2 = Decoration("slate")
    val decoration3 = Decoration("slate")
    println(decoration2)  // Output: Decoration(rocks=slate)
    println(decoration3)  // Output: Decoration(rocks=slate)

    // Compare the Decoration objects
    println(decoration1 == decoration2)  // Output: false
    println(decoration3 == decoration2)  // Output: true

    // Create and print an instance of Decoration2
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)  // Output: Decoration2(rocks=crystal, wood=wood, diver=diver)

    // Destructure Decoration2 into variables
    val (rock, wood, diver) = d5
    println(rock)  // Output: crystal
    println(wood)  // Output: wood
    println(diver) // Output: diver

    // Skip some properties during destructuring
    val (onlyRock, _, onlyDiver) = d5
    println(onlyRock)  // Output: crystal
    println(onlyDiver) // Output: diver