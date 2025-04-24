package com.example.mycomposelabs
fun main() {
    buildAquarium()
}

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    // Init blocks
    init {
        println("aquarium initializing")
    }
    init {
        // Calculate the initial volume in liters
        println("Volume: ${volume} liters")
    }

    // Getter and Setter for Volume
    var volume: Int
        get() = width * height * length / 1000  // Volume in liters
        set(value) {
            height = (value * 1000) / (width * length)  // Recalculate height based on volume
        }

    // Secondary Constructor
    constructor(numberOfFish: Int) : this() {
        // Calculate tank size based on number of fish (2 liters per fish + 10% extra)
        val tankVolume = (numberOfFish * 2000 * 1.1).toInt()
        height = (tankVolume / (width * length)).toInt()  // Adjust height
    }

    // Print dimensions and volume
    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
        println("Volume: $volume liters")
    }
}

fun buildAquarium() {
    // Default Aquarium
    val aquarium1 = Aquarium()
    aquarium1.printSize()

    // Custom width
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    // Custom height and length
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()

    // Completely custom dimensions
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    // Using the secondary constructor (29 fish)
    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()

    // Adjusting volume explicitly
    aquarium5.volume = 70
    aquarium5.printSize()
}
