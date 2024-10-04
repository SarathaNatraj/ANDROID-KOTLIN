package com.example.newsapp

import com.example.newsapp.service.Calculator
import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {

    @Test
    fun addition_twoNumbers_returnsSum() {

        // Arrange
        val calculator = Calculator()

        // Act
        val result = calculator.add(3, 4)

        // Assert
        assertEquals(7, result)
    }

    @Test
    fun multiply_twoNumbers_returnsProduct() {


        // Arrange
        val calculator = Calculator()

        // Act
        val result = calculator.mul(3, 4)

        // Assert
        assertEquals(11, result)
    }
}
