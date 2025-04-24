package com.example.mycomposelabs

// Define the FishAction interface
interface FishAction {
    fun eat()
}

// Define the FishColor interface
interface FishColor {
    val color: String
}

// Singleton class for GoldColor (helper object for FishColor)
object GoldColor : FishColor {
    override val color = "gold"
}

// Helper class for FishAction (printing what the fish eats)
class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

// Plecostomus class using interface delegation for FishColor and FishAction
class Plecostomus(fishColor: FishColor = GoldColor) : 
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

// Shark class with its own delegation for behavior and color
class Shark : FishAction by PrintingFishAction("hunt and eat fish"),
    FishColor {
    override val color = "grey"
}