package com.epam.unitconvertor.models;

import com.epam.unitconvertor.interfaces.Unit;

/**
 * The Class Feet.
 * 
 * @author Somesh_Thakur
 */
public class Feet implements Unit {

	/** The factor. */
	// Factor for converting from Given unit to meter
	protected final double factor = 3.281;

	/** The value. */
	protected double value;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.someshthakur.interfaces.Unit#getValue()
	 */
	@Override
	public double getValue() {
		return value / factor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.someshthakur.interfaces.Unit#setValue(double)
	 */
	/*
	 * Converting the given value into baseline unit as Meter. This will help into
	 * converting between different units
	 */
	@Override
	public void setValue(double value) {
		this.value = value * factor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.someshthakur.interfaces.Unit#_getConValue()
	 */
	@Override
	public double _getConValue() {
		return value;
	}
}
