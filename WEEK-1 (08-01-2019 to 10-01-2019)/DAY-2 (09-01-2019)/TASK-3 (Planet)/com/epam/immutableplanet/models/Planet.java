package com.epam.immutableplanet.models;

import java.util.List;

/**
 * The Class Planet.
 *
 * @author Somesh_Thakur
 */
public final class Planet {

	/** The oceans list. */
	private final List<Ocean> oceansList;

	/** The continents list. */
	private final List<Continent> continentsList;

	/** The name. */
	private final String name;

	/** The mass. */
	private final double mass;

	/**
	 * Instantiates a new planet.
	 *
	 * @param name           the name
	 * @param mass           the mass
	 * @param oceansList     the oceans list
	 * @param continentsList the continents list
	 */
	public Planet(final String name, final double mass, final List<Ocean> oceansList,
			final List<Continent> continentsList) {
		this.name = name;
		this.mass = mass;
		this.oceansList = oceansList;
		this.continentsList = continentsList;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the mass.
	 *
	 * @return the mass
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * Gets the oceans.
	 *
	 * @return the oceans
	 */
	public List<Ocean> getOceans() {
		return oceansList;
	}

	/**
	 * Gets the continents.
	 *
	 * @return the continents
	 */
	public List<Continent> getContinents() {
		return continentsList;
	}

}
