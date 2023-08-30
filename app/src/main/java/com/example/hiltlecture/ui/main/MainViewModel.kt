package com.example.hiltlecture.ui.main

import androidx.lifecycle.ViewModel
import com.example.hiltlecture.data.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {
    fun getRepository() = repository.toString()
}