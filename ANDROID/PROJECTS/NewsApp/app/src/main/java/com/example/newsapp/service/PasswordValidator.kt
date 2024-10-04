package com.example.newsapp.service

class PasswordValidator {
    // Password must be at least 8 characters, contain at least one letter and one digit
    fun isPasswordValid(password: String): Boolean {
        return password.length >= 8 && password.any { it.isDigit() } && password.any { it.isLetter() }
    }
}
