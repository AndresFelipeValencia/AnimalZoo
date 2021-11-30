package com.example.zooanimals

class AnimalObject {
    var nameAnimal: String? = null
    var foodAnimal: String? = null
    var specieAnimal: String? = null

    fun AnimalObject(nameAnimal: String?, foodAnimal: String?, specieAnimal: String?) {
        this.nameAnimal = nameAnimal
        this.foodAnimal = foodAnimal
        this.specieAnimal = specieAnimal
    }

    fun printAnimalObject(i: Int) {
        println(" Type of animal " + nameAnimal + " " + "your food is " + foodAnimal + " " + specieAnimal)
    }

    fun isCarnivore(): Boolean {
        return if (specieAnimal!!.contains("carnivore")) {
            true
        } else specieAnimal!!.contains("Carnivore")
    }

    fun isHerbivore(): Boolean {
        return if (specieAnimal!!.contains("herbivore")) {
            true
        } else specieAnimal!!.contains("Herbivore")
    }

}

