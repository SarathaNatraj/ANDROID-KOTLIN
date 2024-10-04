package com.example.newsapp
import com.example.newsapp.service.PasswordValidator
import org.junit.Assert.*
import org.junit.Test

class PasswordValidatorTest {

    @Test
    fun password_withValidPassword_returnsTrue() {
        val validator = PasswordValidator()
        val result = validator.isPasswordValid("Password123")
        assertTrue(result)
    }

    @Test
    fun password_withShortPassword_returnsFalse() {
        val validator = PasswordValidator()
        val result = validator.isPasswordValid("Pass1")
        assertFalse(result)
    }

    @Test
    fun password_withNoDigits_returnsFalse() {
        val validator = PasswordValidator()
        val result = validator.isPasswordValid("Password")
        assertFalse(result)
    }

    @Test
    fun password_withLetters_returnsFalse() {
        val validator = PasswordValidator()
        val result = validator.isPasswordValid("12345678")
        assertFalse(result)
    }
}
