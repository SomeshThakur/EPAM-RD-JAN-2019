package com.epam.CalculatorJunit;

import com.epam.CalculatorJunit.exceptions.OutOfIntegerRange;

public class Calculator {

	public int add(int first, int second) throws OutOfIntegerRange {
		int result = first + second;
		if ((bothArePositive(first, second) && postiveResultIsOutOfRange(result))
				|| bothAreNegative(first, second) && negativeResultIsOutOfRange(result))
			throw new OutOfIntegerRange();
		return first + second;
	}

	private boolean bothAreNegative(int first, int second) {
		return first < 0 && second < 0;
	}

	private boolean negativeResultIsOutOfRange(int result) {
		return result > 0;
	}

	private boolean postiveResultIsOutOfRange(int result) {
		return result < 0;
	}

	private boolean bothArePositive(int first, int second) {
		return first >= 0 && second >= 0;
	}

}
