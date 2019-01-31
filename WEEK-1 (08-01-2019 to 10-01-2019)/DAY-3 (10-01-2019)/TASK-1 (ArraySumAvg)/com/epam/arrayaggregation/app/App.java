package com.epam.arrayaggregation.app;

import java.util.Scanner;

import com.epam.arrayaggregation.util.ArrayUtil;

/**
 * The Class ArraySumAvg.
 * 
 * @author Somesh_Thakur
 *
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		try (Scanner scan = new Scanner(System.in)) {
			int size;
			System.out.println("Enter Size of Array : ");
			size = scan.nextInt();
			int array[] = new int[size];
			System.out.println("Enter Array Values :");
			arrayUtil.readArray(scan, array);
			System.out.println("Sum of Array : " + arrayUtil.arraySum(array));
			System.out.println("Average of Array : " + arrayUtil.arrayAvg(array));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}