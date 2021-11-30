package com.example.zooanimals

import org.w3c.dom.Text
import java.util.*
import kotlin.collections.ArrayList

class Zoologico {

//    private val zooAnimals = ArrayList<AnimalObject>()
    val listAnimalsZoo: MutableList<AnimalObject> = mutableListOf()

    fun getHerbivoresAnimals() {
        for (i in 0 until listAnimalsZoo.size) {
            when {
                listAnimalsZoo.get(i).isCarnivore() -> {
                }
            }
        }
    }

    fun getCarnivoresAnimals(){
        for (i in 0 until listAnimalsZoo.size) {
            when {
                listAnimalsZoo.get(i).isHerbivore() -> {
                }
            }
        }
    }



}