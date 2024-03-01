package com.example.cleanarchitecturewithmvvm.app.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecturewithmvvm.domain.models.User
import com.example.cleanarchitecturewithmvvm.domain.usecases.UserUseCase
import kotlinx.coroutines.launch

class UserViewModel(private val userUseCase: UserUseCase) : ViewModel() {
    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> = _users

    init {
        viewModelScope.launch {
            _users.value = userUseCase.getUsers()
        }
    }
}