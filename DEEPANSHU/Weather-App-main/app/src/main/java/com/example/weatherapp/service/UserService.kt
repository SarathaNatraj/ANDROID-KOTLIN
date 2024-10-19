package com.example.weatherapp.service

import com.example.weatherapp.helper.DataHelper.Companion.userMap
import com.example.weatherapp.helper.User

class UserService {
    // Add data to the map
    fun addUser(email: String, user: User) :Boolean {
        if (userMap.containsKey(email)) {
            userMap[email]?.add(user) // Add user to the existing list
            return true
        } else {
            userMap[email] = arrayListOf(user) // Create a new ArrayList if key doesn't exist
            return false
        }
    }



}