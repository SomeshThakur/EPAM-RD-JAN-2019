package com.epam.immutableplanet.models;

/**
 * The Class Ocean.
 *
 * @author Somesh_Thakur
 */
public class Ocean {

	/** The name. */
	protected String name;

	/**
	 * Instantiates a new ocean.
	 *
	 * @param name the name
	 */
	public Ocean(final String name) {
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
