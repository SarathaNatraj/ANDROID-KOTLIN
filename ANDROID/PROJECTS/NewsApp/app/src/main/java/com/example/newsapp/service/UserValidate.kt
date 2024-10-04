package com.example.newsapp.service

class UserValidate(
    private val emailValidator: EmailValidator = EmailValidator(),
    private val passwordValidator: PasswordValidator = PasswordValidator()
) {
    fun isUserValid(email: String, password: String): Boolean {
        return emailValidator.isEmailValid(email) && passwordValidator.isPasswordValid(password)
    }
}
