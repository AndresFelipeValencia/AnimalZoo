package com.example.zooanimals

import org.w3c.dom.Text
import java.text.NumberFormat

class AnimalObject
    (val nameAnimal: String, val foodAnimal: String, val specieAnimal: String) {

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


}

