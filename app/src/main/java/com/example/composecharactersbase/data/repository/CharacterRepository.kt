package com.example.composecharactersbase.data.repository

import com.example.composecharactersbase.data.api.CharacterApiService

class CharacterRepository(private val apiService: CharacterApiService){
    fun getCharacter() = apiService.getCharacter()
}