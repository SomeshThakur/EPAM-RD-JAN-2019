package com.epam.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The Class TestStreamsEvenOdd.
 *
 * @author Somesh_Thakur
 */
class TestStreamsEvenOdd {

	/** The number util. */
	private static NumberUtil numberUtil;

	/**
	 * Inits the.
	 */
	@BeforeAll
	private static void init() {
		numberUtil = new NumberUtil();
		numberUtil.setSupplier(() -> IntStream.range(1, 101).boxed());
	}

	/**
	 * Test even count in range 1 to 100.
	 */
	@Test
	@DisplayName("Test Even Numbers Count in Range 1 to 100")
	public void testEvenCountInRange1To100() {
		numberUtil.setPredicate(num -> num % 2 == 0);
		numberUtil.collectIntStats();
		assertEquals(50, numberUtil.getCount());
	}

	/**
	 * Test odd count in range 1 to 100.
	 */
	@Test
	@DisplayName("Test Odd Numbers Count in Range 1 to 100")
	public void testOddCountInRange1To100() {
		numberUtil.setPredicate(num -> num % 2 != 0);
		numberUtil.collectIntStats();
		assertEquals(50, numberUtil.getCount());
	}

	/**
	 * Test odd sum in range 1 to 100.
	 */
	@Test
	@DisplayName("Test Odd Numbers Sum in Range 1 to 100")
	public void testOddSumInRange1To100() {
		numberUtil.setPredicate(num -> num % 2 != 0);
		numberUtil.collectIntStats();
		assertEquals(2500, numberUtil.getSum());
	}

	/**
	 * Test even sum in range 1 to 100.
	 */
	@Test
	@DisplayName("Test Even Numbers Sum in Range 1 to 100")
	public void testEvenSumInRange1To100() {
		numberUtil.setPredicate(num -> num % 2 == 0);
		numberUtil.collectIntStats();
		assertEquals(2550, numberUtil.getSum());
	}
}
