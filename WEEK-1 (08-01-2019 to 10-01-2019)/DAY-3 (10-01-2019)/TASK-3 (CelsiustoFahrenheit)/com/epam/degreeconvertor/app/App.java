package com.epam.degreeconvertor.app;

import com.epam.degreeconvertor.util.DegreeConverter;

/**
 * The Class DegreeConverter.
 *
 * @author Somesh_Thakur
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		if (args.length < 2) {
			System.err.println("Requires 2 Command line args");
			return;
		}
		DegreeConverter dc = new DegreeConverter();
		String firstArg = args[0];
		String secondArg = args[1];
		if (firstArg.equals("0")) {
			System.out.println(dc.celsiusToFahrenheit(secondArg));
		} else {
			System.out.println(dc.fahrenheitToCelsius(secondArg));
		}
	}
}