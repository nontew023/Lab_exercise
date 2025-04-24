package com.example.mycomposelabs
// Step 1: Learn about lambdas
fun main() {
    // Lambda to filter water by reducing dirty level
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel)) // Output: 10

    // Using function type syntax
    val waterFilterExplicit: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilterExplicit(dirtyLevel)) // Output: 10

    // Step 2: Create a higher-order function
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    // Passing a lambda to the higher-order function
    println(updateDirty(30, waterFilter)) // Output: 15

    // Named function for updating dirty level
    fun increaseDirty(start: Int) = start + 1

    // Passing a named function using :: operator
    println(updateDirty(15, ::increaseDirty)) // Output: 16

    // Using Kotlin's last parameter call syntax
    dirtyLevel = updateDirty(dirtyLevel) { dirty -> dirty + 23 }
    println(dirtyLevel) // Output: 42
}
