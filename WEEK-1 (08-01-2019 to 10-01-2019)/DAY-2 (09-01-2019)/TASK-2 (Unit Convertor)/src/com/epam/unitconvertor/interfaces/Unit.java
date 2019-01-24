package com.epam.unitconvertor.interfaces;

/**
 * The Interface Unit. getter and setter methods _getConValue will return common
 * baseline unit value which is meter.
 * 
 * @author Somesh_Thakur
 */
public interface Unit {

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public double getValue();

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(double value);

	/**
	 * Gets the con value.
	 *
	 * @return the double
	 */
	public double _getConValue();
}
