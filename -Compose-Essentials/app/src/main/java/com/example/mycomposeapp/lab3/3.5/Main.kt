package com.example.mycomposelabs
fun main() {
    // Singleton example
    println("GoldColor Singleton Color: ${GoldColor.color}")

    // Enums usage
    useEnums()
}
// Enum for Colors
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);
}

// Enum for Directions
enum class Direction(val degrees: Int) {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270)
}

fun useEnums() {
    // Access properties of enum constants
    println("Color RED RGB: ${Color.RED.rgb}")
    println("Direction EAST: Name = ${Direction.EAST.name}, Ordinal = ${Direction.EAST.ordinal}, Degrees = ${Direction.EAST.degrees}")
}
// Singleton object
object GoldColor : FishColor {
    override val color = "gold"
}

// Interface for FishColor
interface FishColor {
    val color: String
}
