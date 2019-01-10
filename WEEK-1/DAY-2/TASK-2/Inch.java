package Task2;

public class Inch implements Unit {
	// Factor for converting from Given unit to meter
	protected final double factor = 0.0254;
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
