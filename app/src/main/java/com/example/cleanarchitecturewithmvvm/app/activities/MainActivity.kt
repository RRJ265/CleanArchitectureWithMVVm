package com.example.cleanarchitecturewithmvvm.app.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchitecturewithmvvm.R
import com.example.cleanarchitecturewithmvvm.app.viewmodels.UserViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        userViewModel.users.observe(this, Observer { users ->
            // Update UI with the list of users
        })
    }
}