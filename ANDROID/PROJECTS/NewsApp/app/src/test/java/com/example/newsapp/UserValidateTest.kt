package com.example.newsapp

import com.example.newsapp.service.UserValidate
import org.junit.Assert.*
import org.junit.Test

class UserValidateTest {

    @Test
    fun user_withValidEmailAndPassword_returnsTrue() {
        val userValidator = UserValidate()
        val result = userValidator.isUserValid("test@example.com", "Password123")
        assertTrue(result)
    }

    @Test
    fun user_withInvalidEmail_returnsFalse() {
        val userValidator = UserValidate()
        val result = userValidator.isUserValid("invalid-email", "Password123")
        assertFalse(result)
    }

    @Test
    fun user_withInvalidPassword_returnsFalse() {
        val userValidator = UserValidate()
        val result = userValidator.isUserValid("test@example.com", "123")
        assertFalse(result)
    }

    @Test
    fun user_withInvalidEmailAndPassword_returnsFalse() {
        val userValidator = UserValidate()
        val result = userValidator.isUserValid("invalid-email", "123")
        assertFalse(result)
    }
}
