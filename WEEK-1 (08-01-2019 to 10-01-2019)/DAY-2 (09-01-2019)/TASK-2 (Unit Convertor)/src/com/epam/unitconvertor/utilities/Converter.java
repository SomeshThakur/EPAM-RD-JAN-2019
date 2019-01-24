package com.epam.unitconvertor.utilities;

import com.epam.unitconvertor.interfaces.Unit;

/**
 * The Class Converter.
 * 
 * @author Somesh_Thakur
 */
public class Converter {

	/** The value. */
	protected double value;

	/**
	 * Convert to meter.
	 *
	 * @param unit the unit
	 * @return the double
	 */
	public double convertToMeter(final Unit unit) {
		value = unit._getConValue();
		return value;
	}

	/**
	 * Convert to feet.
	 *
	 * @param unit the unit
	 * @return the double
	 */
	public double convertToFeet(final Unit unit) {
		value = unit._getConValue();
		return value * 3.281;
	}

	/**
	 * Convert to inch.
	 *
	 * @param unit the unit
	 * @return the double
	 */
	public double convertToInch(final Unit unit) {
		value = unit._getConValue();
		return value * 39.37;
	}
}
