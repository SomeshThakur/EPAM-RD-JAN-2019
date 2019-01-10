import java.util.List;

public final class Planet {
	private final List<Ocean> oceansList;
	private final List<Continent> continentsList;
	private final String name;
	private final double mass;

	public Planet(final String name, final double mass, final List<Ocean> oceansList,
			final List<Continent> continentsList) {
		this.name = name;
		this.mass = mass;
		this.oceansList = oceansList;
		this.continentsList = continentsList;
	}

	public String getName() {
		return name;
	}

	public double getMass() {
		return mass;
	}

	public List<Ocean> getOceans() {
		return oceansList;
	}

	public List<Continent> getContinents() {
		return continentsList;
	}

}
