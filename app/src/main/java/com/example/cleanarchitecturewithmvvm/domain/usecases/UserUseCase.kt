package com.example.cleanarchitecturewithmvvm.domain.usecases

import com.example.cleanarchitecturewithmvvm.domain.models.User
import com.example.cleanarchitecturewithmvvm.domain.repos.UserRepository

interface UserUseCase {
    suspend fun getUsers(): List<User>
}

class UserUseCaseImpl(private val userRepository: UserRepository) : UserUseCase {
    override suspend fun getUsers(): List<User> {
        return userRepository.getUsers()
    }
}