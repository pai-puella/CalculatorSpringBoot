package com.app.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void testPlus() {
        assertEquals(10, calculatorService.plus(5, 5));
        assertEquals(0, calculatorService.plus(-5, 5));
    }

    @Test
    void testMinus() {
        assertEquals(0, calculatorService.minus(5, 5));
        assertEquals(-10, calculatorService.minus(5, 15));
    }

    @Test
    void testMultiply() {
        assertEquals(25, calculatorService.multiply(5, 5));
        assertEquals(-25, calculatorService.multiply(5, -5));
    }

    @Test
    void testDivide() {
        assertEquals(1, calculatorService.divide(5, 5));
        assertEquals(2, calculatorService.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(5, 0));
    }
}

