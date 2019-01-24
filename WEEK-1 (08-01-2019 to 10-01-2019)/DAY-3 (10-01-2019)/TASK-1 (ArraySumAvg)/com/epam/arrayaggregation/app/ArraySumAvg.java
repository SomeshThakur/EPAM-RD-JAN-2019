package com.epam.arrayaggregation.app;

import java.util.Scanner;

/**
 * The Class ArraySumAvg.
 * 
 * @author Somesh_Thakur
 *
 */
public class ArraySumAvg {

	/**
	 * Array sum.
	 *
	 * @param array the array
	 * @return the int
	 */
	public static int arraySum(int array[]) {
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
	public static int arrayAvg(int array[]) {
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
	public static void readArray(Scanner scan, int array[]) {
		for (int index = 0; index < array.length; index++) {
			array[index] = scan.nextInt();
		}
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int size;
			System.out.println("Enter Size of Array : ");
			size = scan.nextInt();
			int array[] = new int[size];
			System.out.println("Enter Array Values :");
			readArray(scan, array);
			System.out.println("Sum of Array : " + arraySum(array));
			System.out.println("Average of Array : " + arrayAvg(array));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}