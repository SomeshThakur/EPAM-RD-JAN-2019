package com.epam.degreeconvertor.util;

/**
 * The Class DegreeConverter.
 *
 * @author Somesh_Thakur
 */
public class DegreeConverter {

	/**
	 * Fahrenheit to Celsius.
	 *
	 * @param value the value
	 * @return the double
	 */
	public double fahrenheitToCelsius(String value) {
		double F = Double.parseDouble(value);
		return (F - 32) * 5 / 9;
	}

	/**
	 * Celsius to Fahrenheit.
	 *
	 * @param value the value
	 * @return the double
	 */
	public double celsiusToFahrenheit(String value) {
		double C = Double.parseDouble(value);
		return (C * 9 / 5) + 32;
	}

}
