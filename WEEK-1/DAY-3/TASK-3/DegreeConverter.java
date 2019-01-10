public class DegreeConverter {
	public double FtoC(String value) {
		double F = Double.parseDouble(value);
		return (F - 32) * 5 / 9;
	}

	public double CtoF(String value) {
		double C = Double.parseDouble(value);
		return (C * 9 / 5) + 32;
	}

	public static void main(String args[]) {
		DegreeConverter dc = new DegreeConverter();
		String firstArg = args[0];
		String secondArg = args[1];
		if (firstArg.equals("0")) {
			System.out.println(dc.CtoF(secondArg));
		} else {
			System.out.println(dc.FtoC(secondArg));
		}
	}
}