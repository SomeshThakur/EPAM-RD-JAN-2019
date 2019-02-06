package com.epam.immutableplanet.app;

import com.epam.immutableplanet.models.Continent;
import com.epam.immutableplanet.models.Ocean;
import com.epam.immutableplanet.models.Planet;
import com.epam.immutableplanet.service.PlanetMaker;

/**
 * The Class SpaceShip.
 *
 * @author Somesh_Thakur
 */
public class SpaceShip {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("SpaceShip started..");
		PlanetMaker planetMaker = new PlanetMaker();
		Planet planet = planetMaker.makeRandomPlanet();
		System.out.println("SpaceShip found new planet..");
		System.out.println("Planet Name : " + planet.getName());
		System.out.println("Planet has following Oceans");
		for (Ocean ocean : planet.getOceans()) {
			System.out.println(ocean.getName());
		}
		System.out.println("Planet has following Continents");
		for (Continent continent : planet.getContinents()) {
			System.out.println(continent.getName());
		}
	}
}
