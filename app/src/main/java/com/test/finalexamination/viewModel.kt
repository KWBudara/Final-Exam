package com.test.finalexamination

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class viewModel {
    private val _usersData = MutableLiveData<String>(null)
    val usersData: LiveData<String>
        get() = _usersData

    fun getUsers() {
        _usersData.value = "Test User"

}