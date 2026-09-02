package com.example.petshop


class Sad(name: String, date: String) : Mood1(name, date) {
    override fun feel(): String {
        return "sadness"
    }
}