package com.epam.lambda_examlpes;

import java.util.function.BiPredicate;

/**
 * The Class BiPredicateExample.
 */
public class BiPredicateExample {
	/**
	 * Operation performs BiPredicate test.
	 *
	 * @param value1      the value 1
	 * @param value2      the value 2
	 * @param biPredicate the bi predicate
	 * @return the int
	 */
	private boolean operation(int value1, int value2, BiPredicate<Integer, Integer> biPredicate) {
		return biPredicate.test(value1, value2);
	}

	public Integer get(BiPredicate<Integer, Integer> biPredicate, Integer arr[]) {
		int result = arr[0];
		for (int number : arr)
			result = operation(number, result, biPredicate) ? number : result;
		return result;
	}
}
