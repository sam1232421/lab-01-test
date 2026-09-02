package com.example.petshop

class Depressed(name: String, date: String) : Mood1(name, date) {
    override fun feel(): String {
        return "depression"
    }
}