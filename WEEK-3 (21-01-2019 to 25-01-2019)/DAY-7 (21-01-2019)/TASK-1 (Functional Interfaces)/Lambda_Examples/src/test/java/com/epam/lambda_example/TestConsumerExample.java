package com.epam.lambda_example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.lambda_examlpes.ConsumerExample;

/**
 * The Class TestConsumer.
 * 
 * @author Somesh_Thakur
 *
 */
class TestConsumerExample {

	/** The consumer example. */
	private static ConsumerExample consumerExample;

	/**
	 * Inits.
	 */
	@BeforeAll
	public static void init() {
		consumerExample = new ConsumerExample();
	}

	/**
	 * Test consumer to add prefix.
	 */
	@Test
	@DisplayName("Test Consumer to add prefix")
	public void testConsumerToAddPrefix() {
		String[] strArr = { "", "Hello", "", "World", "I", "am", "practicing", "lambda", "and", "predicate.", "", };
		List<String> newList = new ArrayList<String>();
		List<String> strList = Arrays.asList(strArr);
		String prefix = "New ";
		consumerExample.forEach(strList, addPrefix(newList, prefix));
		assertEquals(getPrefixAddedList(strList, prefix), newList);
	}

	/**
	 * Gets the prefix added list.
	 *
	 * @return the prefix added list
	 */
	private List<String> getPrefixAddedList(List<String> strList, String prefix) {
		List<String> result = new ArrayList<String>();
		for (String str : strList) {
			if (!str.isEmpty())
				result.add(prefix + str);
		}
		return result;
	}

	/**
	 * Adds the prefix.
	 *
	 * @param newList the new list
	 * @param prefix  the prefix
	 * @return the consumer
	 */
	private Consumer<String> addPrefix(List<String> newList, String prefix) {
		return (str) -> {
			if (!str.isEmpty()) {
				newList.add(prefix + str);
			}
		};
	}
}
