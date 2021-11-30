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
        binding.consultButton.setOnClickListener { consultAnimal() }
    }

    fun saveAnimalData() {
        val name = binding.enterNameAnimal.text.toString()
        val specie = binding.enterSpecieAnimal.text.toString()
        val food = binding.enterFoodAnimal.text.toString()

        val animalObject = AnimalObject(name, specie, food)
        instanceOfZoologico.listAnimalsZoo.add(animalObject)

    }

    fun consultAnimal() {
        val allAnimal = binding.optionsConsult.checkedRadioButtonId
        val consult = when (allAnimal) {
            R.id.all_herbivores -> ""
            R.id.all_carnivores -> ""
            else -> ""
        }

        binding.printResult.text = consult
    }








}


// instanceOfZoologico.getCarnivoresAnimals()
//
//
//
//       instanceOfZoologico.getHerbivoresAnimals()
//       instanceOfZoologico.getCarnivoresAnimals()
//       instanceOfZoologico.getAllAnimals()