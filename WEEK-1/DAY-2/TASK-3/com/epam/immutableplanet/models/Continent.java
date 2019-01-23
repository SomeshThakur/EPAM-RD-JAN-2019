package com.epam.immutableplanet.models;

/**
 * The Class Continent.
 *
 * @author Somesh_Thakur
 */
public class Continent {

	/** The name. */
	protected String name;

	/**
	 * Instantiates a new continent.
	 *
	 * @param name the name
	 */
	public Continent(final String name) {
		this.name = name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
