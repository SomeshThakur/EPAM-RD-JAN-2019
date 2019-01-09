package Task2;

public class Feet implements Unit{
	protected final double factor = 3.281;
	protected double value;

	@Override
	public double getValue() {
		return value / factor;
	}

	@Override
	public void setValue(double value) {
		this.value = value * factor;
	}
	
	@Override
	public double _getConValue() {
		return value;
	}
}
