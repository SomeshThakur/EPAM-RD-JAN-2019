package com.epam.lambda_examlpes;

import java.util.function.BiPredicate;

/**
 * The Class BiPredicateExample.
 */
public class BiPredicateExample {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
	BiPredicate<Integer, Integer> maxBiPredicate = (x, y) -> x > y;
	BiPredicateExample biPredicateExample = new BiPredicateExample();
	Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	int result = 1;
	for (int number : arr)
	    result = biPredicateExample.operation(number, result, maxBiPredicate) ? number : result;
	System.out.println(result);
    }

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
}
