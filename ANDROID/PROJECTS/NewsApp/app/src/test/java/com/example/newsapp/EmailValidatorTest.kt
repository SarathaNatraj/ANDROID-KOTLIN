package com.example.newsapp


import com.example.newsapp.service.EmailValidator
import org.junit.Assert.*
import org.junit.Test


class EmailValidatorTest {

    @Test
    fun email_withValidEmail_returnsTrue() {
        val validator = EmailValidator()
        val result = validator.isEmailValid("test@example.com")
        assertTrue(result)
    }

    @Test
    fun email_withInvalidEmail_returnsFalse() {
        val validator = EmailValidator()
        val result = validator.isEmailValid("invalid-email")
        assertFalse(result)
    }

    @Test
    fun email_withMissingAtSymbol_returnsFalse() {
        val validator = EmailValidator()
        val result = validator.isEmailValid("testexample.com")
        assertFalse(result)
    }

    @Test
    fun email_withMissingDomain_returnsFalse() {
        val validator = EmailValidator()
        val result = validator.isEmailValid("test@.com")
        assertFalse(result)
    }
}
