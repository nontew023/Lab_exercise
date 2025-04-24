package com.example.mycomposelabs
import java.util.*    // Required import for Random()

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
        else -> "nothing" // Default branch ensures food always has a value
    }
}

// Function to feed the fish based on the day and its food
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

// Main entry point to the program
fun main(args: Array<String>) {
    feedTheFish()
}
