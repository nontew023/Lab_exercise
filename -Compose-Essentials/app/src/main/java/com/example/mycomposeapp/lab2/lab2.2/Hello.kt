package com.example.mycomposelabs
import java.util.* // Required import for Random()

// Function to generate a random day of the week
fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

// Function to determine fish food based on the day
fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

// Compact function to check if it's too hot
fun isTooHot(temperature: Int) = temperature > 30

// Compact function to check if the water is dirty
fun isDirty(dirty: Int) = dirty > 30

// Compact function to check if it's Sunday
fun isSunday(day: String) = day == "Sunday"

// Function to check if the water should be changed
fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

// Function to feed the fish and check water conditions
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

// Function to demonstrate default values and named parameters
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun main(args: Array<String>) {
    // Feed the fish and check water conditions
    feedTheFish()

    // Demonstrate swim() with default, positional, and named parameters
    swim()               // Uses default speed
    swim("slow")         // Positional argument
    swim(speed = "turtle-like") // Named parameter
}
