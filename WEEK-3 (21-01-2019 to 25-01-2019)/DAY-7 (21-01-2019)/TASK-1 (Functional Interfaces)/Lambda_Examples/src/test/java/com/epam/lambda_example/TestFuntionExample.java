package com.epam.lambda_example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.lambda_examlpes.FunctionExample;

/**
 * The Class TestFuntionExample.
 * 
 * @author Somesh_Thakur
 *
 */
class TestFuntionExample {

	/** The function example. */
	private static FunctionExample functionExample;

	/**
	 * Inits.
	 */
	@BeforeAll
	public static void init() {
		functionExample = new FunctionExample();
	}

	/**
	 * Tests the Function Interface.
	 */
	@Test
	@DisplayName("Test Function Interface")
	public void testFunc() {
		String[] strArr = { "", "Hello", "", "World", "I", "am", "practicing", "lambda", "and", "predicate.", "", };
		List<String> strList = Arrays.asList(strArr);
		List<Integer> lenghthList = functionExample.eval(strList, (str) -> str.length());
		assertEquals(getLenList(strList), lenghthList);
	}

	/**
	 * Gets the len list.
	 *
	 * @param strList the str list
	 * @return the len list
	 */
	private List<Integer> getLenList(List<String> strList) {
		List<Integer> result = new ArrayList<Integer>();
		for (String str : strList) {
			result.add(str.length());
		}
		return result;
	}
}
