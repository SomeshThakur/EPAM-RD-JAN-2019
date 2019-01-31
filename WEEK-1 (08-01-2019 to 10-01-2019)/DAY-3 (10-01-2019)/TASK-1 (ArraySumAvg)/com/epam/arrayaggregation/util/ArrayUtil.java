package com.epam.arrayaggregation.util;

import java.util.Scanner;

/**
 * The Class ArrayUtil.
 *
 * @author Somesh_Thakur
 */
public class ArrayUtil {
	/**
	 * Array sum.
	 *
	 * @param array the array
	 * @return the int
	 */
	public int arraySum(int array[]) {
		int result = 0;
		for (int value : array) {
			result += value;
		}
		return result;
	}

	/**
	 * Array avg.
	 *
	 * @param array the array
	 * @return the int
	 */
	public int arrayAvg(int array[]) {
		int result = arraySum(array);
		result = result / array.length;
		return result;
	}

	/**
	 * Read array.
	 *
	 * @param scan  the scan
	 * @param array the array
	 */
	public void readArray(Scanner scan, int array[]) {
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
	}
}
