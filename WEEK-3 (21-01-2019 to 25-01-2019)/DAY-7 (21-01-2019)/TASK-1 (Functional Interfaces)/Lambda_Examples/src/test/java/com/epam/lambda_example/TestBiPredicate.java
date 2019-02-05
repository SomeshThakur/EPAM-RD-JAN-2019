/**
 * 
 */
package com.epam.lambda_example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.lambda_examlpes.BiPredicateExample;

/**
 * @author Somesh_Thakur
 *
 */
class TestBiPredicate {
	static BiPredicateExample biPredicateExample;

	@BeforeAll
	public static void init() {
		biPredicateExample = new BiPredicateExample();
	}

	@Test
	@DisplayName("Test Bi Predicate for Max Number")
	public void testMaxBiPredicate() {
		Integer arr[] = { 1, 2, 3, 3, 4, 45, 5, 56, 6, 6, 67, 4 };
		int result = biPredicateExample.get((x, y) -> x > y, arr);
		assertEquals(67, result);
	}

	@Test
	@DisplayName("Test Bi Predicate for Min Number")
	public void testMinBiPredicate() {
		Integer arr[] = { 1, 2, 3, 3, 4, 45, 5, 56, 6, 6, 67, 4 };
		int result = biPredicateExample.get((x, y) -> x < y, arr);
		assertEquals(1, result);
	}

	@Test
	@DisplayName("Test Bi Predicate for Max Negative Number")
	public void testMaxNegBiPredicate() {
		Integer arr[] = { -1, -2, -3, -6, -100 };
		int result = biPredicateExample.get((x, y) -> x > y, arr);
		assertEquals(-1, result);
	}

	@Test
	@DisplayName("Test Bi Predicate for Min Negative Number")
	public void testMinNegBiPredicate() {
		Integer arr[] = { -1, -2, -3, -6, -100 };
		int result = biPredicateExample.get((x, y) -> x < y, arr);
		assertEquals(-100, result);
	}
}
