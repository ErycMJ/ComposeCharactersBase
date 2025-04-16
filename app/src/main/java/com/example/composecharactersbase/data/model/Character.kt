package com.example.composecharactersbase.data.model

data class Character(
    val id: Int,
    val name: String,
    val air_date: String,
    val epsode: String,
    val character: Character
)