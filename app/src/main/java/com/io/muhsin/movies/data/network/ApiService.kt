package com.io.muhsin.movies.data.network

import com.io.muhsin.movies.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/shows")
    suspend fun getAllMovies(): Response<List<Movies>>
}