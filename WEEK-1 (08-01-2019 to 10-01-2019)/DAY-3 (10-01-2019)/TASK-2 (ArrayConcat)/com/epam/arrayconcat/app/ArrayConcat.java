package com.epam.arrayconcat.app;

import com.epam.arrayconcat.util.ArrayUtil;

/**
 * The Class ArrayConcat.
 *
 * @author Somesh_Thakur
 */
public class ArrayConcat {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		ArrayUtil arrayUtil = new ArrayUtil();
		System.out.println("Using Java 8...");
		System.out.println(arrayUtil.joinJava8(arr, "!"));
		System.out.println("Old method...");
		System.out.println(arrayUtil.join(arr, "*"));
	}
}