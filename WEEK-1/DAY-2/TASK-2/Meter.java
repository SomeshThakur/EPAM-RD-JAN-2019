package Task2;

public class Meter implements Unit {
	// Factor for converting from Given unit to meter
	protected final double factor = 1;
	protected double value;

	@Override
	public double getValue() {
		return value / factor;
	}

	/*
	 * Converting the given value into baseline unit as Meter.
	 * This will help into converting between different units
	 */
	@Override
	public void setValue(double value) {
		this.value = value * factor;
	}

	@Override
	public double _getConValue() {
		return value;
	}
}
