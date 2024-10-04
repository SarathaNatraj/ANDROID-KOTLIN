package com.example.newsapp.service

class UserValidator {

    // Email should have basic validation for "name@domain"
    fun isEmailValid(email: String): Boolean {
      //  return email.contains("@") && email.contains(".")

        //Refractoring the code -> generic implementation
        val emailRegex = "^[A-Za-z](.*)([@])(.+)(\\.)(.+)"
        return email.matches(Regex(emailRegex))

    }

    // Password should be at least 8 characters long and contain letters and digits
    fun isPasswordValid(password: String): Boolean {
        return password.length >= 8 && password.any { it.isDigit() } && password.any { it.isLetter() }
    }
}
