package com.example.cleanarchitecturewithmvvm.domain.repos

import com.example.cleanarchitecturewithmvvm.domain.models.User

interface UserRepository {
    suspend fun getUsers(): List<User>
}