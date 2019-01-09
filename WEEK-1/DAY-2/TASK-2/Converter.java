package Task2;

public class Converter {
	protected double value;
	public double convertToMeter(final Unit unit) {
		value = unit._getConValue();
		return value;
	}

	public double convertToFeet(final Unit unit) {
		value = unit._getConValue();
		return value * 3.281;
	}

	public double convertToInch(final Unit unit) {
		value = unit._getConValue();
		return value * 39.37;
	}
}
