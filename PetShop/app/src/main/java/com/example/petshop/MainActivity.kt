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
        val scorpion = Scorpion("jam", 6) // see how from toturial it uses the val taht reps the thing

        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)


        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)
        //pettablePets.add(scorpion) , we excluding scoprion as not pettable

        val depressed1 = Depressed("depression", "02")
        val sad1 = Sad("sadness", "02")

        val allmoods = mutableListOf<Mood1>()
        allmoods.add(depressed1)
        allmoods.add(sad1)
    }
}