package com.example.composecharactersbase.data.api

import retrofit2.http.GET
import retrofit2.Call

interface CharacterApiService{
    @GET("character?type=single")
    fun getCharacter(): Call<Character>
}