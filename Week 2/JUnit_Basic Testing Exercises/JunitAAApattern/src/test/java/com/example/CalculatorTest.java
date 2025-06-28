package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    // Setup method (runs before each @Test)
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    // Teardown method (runs after each @Test)
    @After
    public void tearDown() {
        System.out.println("Teardown complete.");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10, b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10, b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(5, result);
    }
}
