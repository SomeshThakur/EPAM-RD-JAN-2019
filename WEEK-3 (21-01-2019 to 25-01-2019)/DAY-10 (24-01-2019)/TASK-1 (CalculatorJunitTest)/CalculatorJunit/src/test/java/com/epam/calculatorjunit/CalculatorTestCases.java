package com.epam.calculatorjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.epam.calculatorjunit.Calculator;
import com.epam.calculatorjunit.exception.OutOfIntegerRange;

import org.junit.jupiter.api.BeforeAll;

/**
 * The Class CalculatorTestCases.
 *
 * @author Somesh_Thakur
 */
public class CalculatorTestCases {

	/** The calculator. */
	private static Calculator calculator;

	/**
	 * Inits the.
	 */
	@BeforeAll
	static void init() {
		calculator = new Calculator();
	}

	/**
	 * Test addition.
	 *
	 * @throws OutOfIntegerRange the out of integer range
	 */
	@Test
	public void testAdditionPositive() throws OutOfIntegerRange {
		int first = 100;
		int second = 123456;
		int expectedResult = first + second;
		int result = calculator.add(first, second);
		assertEquals(expectedResult, result);

	}

	/**
	 * Test addition negative.
	 *
	 * @throws OutOfIntegerRange the out of integer range
	 */
	@Test
	public void testAdditionNegative() throws OutOfIntegerRange {
		int first = -12023;
		int second = -212;
		int expectedResult = first + second;
		int result = calculator.add(first, second);
		assertEquals(expectedResult, result);
	}

	/**
	 * Test addtion out of range.
	 */
	@Test
	public void testAddtionPositiveOutOfRange() {
		int first = Integer.MAX_VALUE;
		int second = 1;
		assertThrows(OutOfIntegerRange.class, () -> {
			calculator.add(first, second);
		});
	}

	/**
	 * Test addtion negative out of range.
	 */
	@Test
	public void testAddtionNegativeOutOfRange() {
		int first = Integer.MIN_VALUE;
		int second = -1;
		Executable executable = () -> {
			calculator.add(first, second);
		};
		assertThrows(OutOfIntegerRange.class, executable);
	}

}
