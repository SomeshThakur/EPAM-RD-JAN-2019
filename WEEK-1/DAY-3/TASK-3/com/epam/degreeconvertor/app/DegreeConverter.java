package com.epam.degreeconvertor.app;

/**
 * The Class DegreeConverter.
 *
 * @author Somesh_Thakur
 */
public class DegreeConverter {

	/**
	 * F to C.
	 *
	 * @param value the value
	 * @return the double
	 */
	public double FtoC(String value) {
		double F = Double.parseDouble(value);
		return (F - 32) * 5 / 9;
	}

	/**
	 * C to F.
	 *
	 * @param value the value
	 * @return the double
	 */
	public double CtoF(String value) {
		double C = Double.parseDouble(value);
		return (C * 9 / 5) + 32;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
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