package com.epam.CalculatorJunit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.epam.CalculatorJunit.exceptions.OutOfIntegerRange;

import org.junit.jupiter.api.BeforeAll;

public class CalculatorTestCases {
	private static Calculator calculator;

	@BeforeAll
	static void init() {
		calculator = new Calculator();
	}

	@Test
	public void testAddition() {
		int first = 100;
		int second = 123456;
		int expectedResult = first + second;
		int result;
		try {
			result = calculator.add(first, second);
			assertTrue(expectedResult == result);
		} catch (OutOfIntegerRange e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void testAddtionOutOfRange() {
		int first = Integer.MAX_VALUE;
		int second = 1;
		assertThrows(OutOfIntegerRange.class, () -> {
			calculator.add(first, second);
		});
	}
}
