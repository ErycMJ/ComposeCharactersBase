package com.example.composecharactersbase.data.network

import com.example.composecharactersbase.data.model.Character
import retrofit2.http.GET

data class CharacterResponse(val results: List<Character>)

interface RickAndMortyApi {
    @GET("character")
    suspend fun getCharacters(): CharacterResponse
}