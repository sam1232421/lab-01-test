package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val cat = Cat("Coco", 6)
        val dog = Dog("Ham", 2)
        val scorpion = Scorpion("jam", 6)

        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)


        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)
        //pettablePets.add(scorpion)
    }
}