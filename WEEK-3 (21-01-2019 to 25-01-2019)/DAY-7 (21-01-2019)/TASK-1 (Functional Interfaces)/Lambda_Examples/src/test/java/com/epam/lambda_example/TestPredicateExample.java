package com.epam.lambda_example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.lambda_examlpes.PredicateExample;

/**
 * The Class TestPredicateExample.
 *
 * @author Somesh_Thakur
 */
class TestPredicateExample {

	/** The predicate example. */
	private static PredicateExample predicateExample;

	/**
	 * Inits.
	 */
	@BeforeAll
	private static void init() {
		predicateExample = new PredicateExample();
	}

	/**
	 * Test predicate starts with A.
	 */
	@Test
	@DisplayName("Test Predicate to filter string which starts with a")
	public void testPredicateStartsWithA() {
		String[] strArr = { "", "Hello", "", "World", "I", "am", "practicing", "lambda", "and", "predicate.", "", };
		List<String> strList = Arrays.asList(strArr);
		List<String> aList = predicateExample.filter(strList, (String str) -> str.startsWith("a"));
		assertEquals(2, aList.size());
	}
}
