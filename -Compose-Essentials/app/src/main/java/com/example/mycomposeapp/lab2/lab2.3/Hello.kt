package com.example.mycomposelabs
// Top-level list of aquarium decorations
val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
    // Filter decorations that start with 'p' (eager evaluation)
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager") // Outputs: eager: [pagoda, plastic plant]

    // Lazy evaluation using Sequence
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered") // Outputs a reference to the Sequence
    val newList = filtered.toList() // Forces evaluation
    println("new list: $newList") // Outputs: new list: [pagoda, plastic plant]

    // Lazy map transformation
    val lazyMap = decorations.asSequence().map {
        println("access: $it") // Prints each accessed element
        it
    }
    println("lazy: $lazyMap") // Outputs: lazy: kotlin.sequences.TransformingSequence
    println("-----")
    println("first: ${lazyMap.first()}") // Accesses the first element
    println("-----")
    println("all: ${lazyMap.toList()}") // Accesses all elements

    // Sequence combining filter and map transformations
    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("access: $it") // Prints accessed elements during filtering and mapping
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}") // Outputs: filtered: [pagoda, plastic plant]

    // Flatten a list of lists into a single list
    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities) // A list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}") // Outputs: Flat: [basketball, fishing, running, LeBron James, Ernest Hemingway, Usain Bolt, Los Angeles, Chicago, Jamaica]
}
