package com.epam.calculatorjunit;


import com.epam.calculatorjunit.exception.OutOfIntegerRange;

/**
 * The Class Calculator.
 *
 * @author Somesh_Thakur
 */
public class Calculator {

	/**
	 * Adds the.
	 *
	 * @param first  the first
	 * @param second the second
	 * @return the int
	 * @throws OutOfIntegerRange the out of integer range
	 */
	public int add(int first, int second) throws OutOfIntegerRange {
		int result = first + second;
		if ((bothArePositive(first, second) && postiveResultIsOutOfRange(result))
				|| bothAreNegative(first, second) && negativeResultIsOutOfRange(result))
			throw new OutOfIntegerRange();
		return first + second;
	}

	/**
	 * Both are negative.
	 *
	 * @param first  the first
	 * @param second the second
	 * @return true, if successful
	 */
	private boolean bothAreNegative(int first, int second) {
		return first < 0 && second < 0;
	}

	/**
	 * Negative result is out of range.
	 *
	 * @param result the result
	 * @return true, if successful
	 */
	private boolean negativeResultIsOutOfRange(int result) {
		return result > 0;
	}

	/**
	 * Postive result is out of range.
	 *
	 * @param result the result
	 * @return true, if successful
	 */
	private boolean postiveResultIsOutOfRange(int result) {
		return result < 0;
	}

	/**
	 * Both are positive.
	 *
	 * @param first  the first
	 * @param second the second
	 * @return true, if successful
	 */
	private boolean bothArePositive(int first, int second) {
		return first >= 0 && second >= 0;
	}

}
