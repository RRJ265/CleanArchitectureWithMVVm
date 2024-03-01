package com.example.cleanarchitecturewithmvvm.network

import com.example.cleanarchitecturewithmvvm.domain.models.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}