package com.example.cleanarchitecturewithmvvm.data

import com.example.cleanarchitecturewithmvvm.domain.models.User

interface UserRemoteDataSource {
    suspend fun getUsers(): List<User>
}