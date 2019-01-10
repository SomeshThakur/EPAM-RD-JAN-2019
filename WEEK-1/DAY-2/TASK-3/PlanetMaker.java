import java.util.ArrayList;
import java.util.List;

public class PlanetMaker {
	protected Planet planet;

	public Planet makeRandomPlanet() {
		List<Ocean> oceansList = makeRandomOceans();
		List<Continent> continentsList = makeRandomContinents();
		planet = new Planet("My Planet", 123456.21, oceansList, continentsList);
		return planet;
	}

	private List<Ocean> makeRandomOceans() {
		List<Ocean> oceansList = new ArrayList<>();
		oceansList.add(new Ocean("Ocean 1"));
		oceansList.add(new Ocean("Ocean 2"));
		oceansList.add(new Ocean("Ocean 3"));
		oceansList.add(new Ocean("Ocean 4"));
		return oceansList;
	}

	private List<Continent> makeRandomContinents() {
		List<Continent> continentsList = new ArrayList<>();
		continentsList.add(new Continent("Continent 1"));
		continentsList.add(new Continent("Continent 2"));
		continentsList.add(new Continent("Continent 3"));
		continentsList.add(new Continent("Continent 4"));
		return continentsList;
	}
}
