package me.demaisj.rickandmortyapiclient.network

import me.demaisj.rickandmortyapiclient.model.Character
import me.demaisj.rickandmortyapiclient.model.PaginatedList
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("character")
    suspend fun getAllCharacters(
        @Query("page") page: Long = 1
    ): PaginatedList<Character>
}