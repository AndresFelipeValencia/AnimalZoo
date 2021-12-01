package com.example.zooanimals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zooanimals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val instanceOfZoologico = Zoologico()

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.saveButtonDate.setOnClickListener { saveAnimalData() }
        binding.allHerbivores.setOnClickListener { buttonConsultHerbivores() }
        binding.allCarnivores.setOnClickListener { buttonConsultCarnivores() }
        binding.allAnimals.setOnClickListener { buttonConsultAllAnimals() }
    }

    fun saveAnimalData() {
        val name = binding.enterNameAnimal.text.toString()
        val specie = binding.enterSpecieAnimal.text.toString()
        val food = binding.enterFoodAnimal.text.toString()

        val animalObject = AnimalObject(name, specie, food)
        instanceOfZoologico.listAnimalsZoo.add(animalObject)
    }

    fun buttonConsultHerbivores() {
        val animals = instanceOfZoologico.listAnimalsZoo
        for (i in animals.indices) {
            if (animals[i].isHerbivore()) {
                animals[i].printAnimalObject(i)
            }
        }
    }

    fun buttonConsultCarnivores() {
        val animals = instanceOfZoologico.listAnimalsZoo
        for (i in animals.indices) {
            if (animals[i].isCarnivore()) {
                animals[i].printAnimalObject(i)
            }
        }
    }

    fun buttonConsultAllAnimals() {
        val allAnimals = instanceOfZoologico.listAnimalsZoo
        for (i in allAnimals.indices) {
            allAnimals[i].printAnimalObject(i)
        }
    }

}
