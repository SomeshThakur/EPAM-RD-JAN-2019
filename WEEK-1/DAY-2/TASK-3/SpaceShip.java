
public class SpaceShip {

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
