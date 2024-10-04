package com.example.newsapp

import com.example.newsapp.service.UserValidator
import org.junit.Assert.*
import org.junit.Test

class UserValidatorTest {

    @Test
    fun email_withValidEmail_returnsTrue() {
        // Arrange
        val validator = UserValidator()

        // Act
        val result = validator.isEmailValid("test@example.com")

        // Assert
        assertTrue(result)
    }

    @Test
    fun email_withInvalidEmail_returnsFalse() {
        val validator = UserValidator()
        val result = validator.isEmailValid("invalid-email")
        assertFalse(result)
    }

    @Test
    fun password_withValidPassword_returnsTrue() {
        val validator = UserValidator()
        val result = validator.isPasswordValid("Password123!")
        assertTrue(result)
    }

    @Test
    fun password_withInvalidPassword_returnsFalse() {
        val validator = UserValidator()
        val result = validator.isPasswordValid("123")
        assertFalse(result)
    }
}
