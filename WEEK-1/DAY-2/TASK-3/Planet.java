import java.util.List;

public final class Planet {
	protected final List<Ocean> oceansList;
	protected final List<Continent> continentsList;
	protected final String name;
	protected final double mass;

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
