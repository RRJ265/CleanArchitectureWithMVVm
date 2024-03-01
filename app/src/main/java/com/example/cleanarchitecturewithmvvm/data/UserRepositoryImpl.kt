package com.example.cleanarchitecturewithmvvm.data

import com.example.cleanarchitecturewithmvvm.domain.models.User
import com.example.cleanarchitecturewithmvvm.domain.repos.UserRepository

class UserRepositoryImpl(private val remoteDataSource: UserRemoteDataSource) : UserRepository {
    override suspend fun getUsers(): List<User> {
        return remoteDataSource.getUsers()
    }
}