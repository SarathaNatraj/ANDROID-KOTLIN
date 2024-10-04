package com.example.newsapp.service

class EmailValidator {

    // Email should have basic validation for "name@domain"
    fun isEmailValid(email: String): Boolean {
        //  return email.contains("@") && email.contains(".")

        //Refractoring the code -> generic implementation
        val emailRegex = "^[A-Za-z](.*)([@])(.+)(\\.)(.+)"
        return email.matches(Regex(emailRegex))

    }
}