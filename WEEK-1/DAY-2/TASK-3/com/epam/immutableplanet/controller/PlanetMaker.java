package com.epam.immutableplanet.controller;

import java.util.ArrayList;
import java.util.List;

import com.epam.immutableplanet.models.Continent;
import com.epam.immutableplanet.models.Ocean;
import com.epam.immutableplanet.models.Planet;

/**
 * The Class PlanetMaker.
 *
 * @author Somesh_Thakur
 */
public class PlanetMaker {

	/** The planet. */
	protected Planet planet;

	/**
	 * Make random planet.
	 *
	 * @return the planet
	 */
	public Planet makeRandomPlanet() {
		List<Ocean> oceansList = makeRandomOceans();
		List<Continent> continentsList = makeRandomContinents();
		planet = new Planet("My Planet", 123456.21, oceansList, continentsList);
		return planet;
	}

	/**
	 * Make random oceans.
	 *
	 * @return the list
	 */
	private List<Ocean> makeRandomOceans() {
		List<Ocean> oceansList = new ArrayList<>();
		oceansList.add(new Ocean("Ocean 1"));
		oceansList.add(new Ocean("Ocean 2"));
		oceansList.add(new Ocean("Ocean 3"));
		oceansList.add(new Ocean("Ocean 4"));
		return oceansList;
	}

	/**
	 * Make random continents.
	 *
	 * @return the list
	 */
	private List<Continent> makeRandomContinents() {
		List<Continent> continentsList = new ArrayList<>();
		continentsList.add(new Continent("Continent 1"));
		continentsList.add(new Continent("Continent 2"));
		continentsList.add(new Continent("Continent 3"));
		continentsList.add(new Continent("Continent 4"));
		return continentsList;
	}
}
