package com.app.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceParameterizedTest {
	private CalculatorService calculatorService;

	@BeforeEach
	void setUp() {
		calculatorService = new CalculatorService();
	}

	@ParameterizedTest
	@CsvSource({
			"5, 5, 10",
			"-5, 5, 0",
			"10, -5, 5"
	})
	void testPlus(int num1, int num2, int expected) {
		assertEquals(expected, calculatorService.plus(num1, num2));
	}

	@ParameterizedTest
	@CsvSource({
			"5, 5, 0",
			"10, 5, 5",
			"5, 10, -5"
	})
	void testMinus(int num1, int num2, int expected) {
		assertEquals(expected, calculatorService.minus(num1, num2));
	}

	@ParameterizedTest
	@CsvSource({
			"5, 5, 25",
			"-5, 5, -25",
			"5, -5, -25"
	})
	void testMultiply(int num1, int num2, int expected) {
		assertEquals(expected, calculatorService.multiply(num1, num2));
	}

	@ParameterizedTest
	@CsvSource({
			"5, 5, 1",
			"10, 5, 2",
			"15, 3, 5"
	})
	void testDivide(int num1, int num2, int expected) {
		assertEquals(expected, calculatorService.divide(num1, num2));
	}
}

