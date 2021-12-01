package com.example.zooanimals

import android.util.Log

class AnimalObject
    (val nameAnimal: String, val specieAnimal: String, val foodAnimal: String) {

    fun isCarnivore(): Boolean {
        return if (specieAnimal.contains("carnivore")) {
            true
        } else specieAnimal.contains("Carnivore")
    }

    fun isHerbivore(): Boolean {
        return if (specieAnimal.contains("herbivore")) {
            true
        } else specieAnimal.contains("Herbivore")
    }

    fun printAnimalObject(i: Int) {
        Log.d(
            "AnimalObject", "Type of animal " + nameAnimal + " " + "its species is" + " "
                    + specieAnimal + " " + "your food is" + " " + foodAnimal
        )
    }

}


