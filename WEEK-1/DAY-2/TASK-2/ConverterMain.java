package Task2;

import java.util.Scanner;

public class ConverterMain {
	protected static int ch;
	protected static double value;
	protected static Unit unit;
	protected static Scanner scan = null;

	public static void printer() {
		System.out.println("-----------------------------");
		System.out.println("1. Meter");
		System.out.println("2. Feet");
		System.out.println("3. Inch");
		System.out.println("Enter your length unit : ");
	}

	public static int init() {
		ch = scan.nextInt();
		switch (ch) {
		case 1:
			unit = new Meter();
			break;
		case 2:
			unit = new Feet();
			break;
		case 3:
			unit = new Inch();
			break;
		default:
			System.out.println("ERROR : Enter correct option!");
			return -1;
		}
		System.out.println("Enter length : ");
		value = scan.nextDouble();
		unit.setValue(value);
		return 0;
	}

	public static int conversion(Converter converter) {
		double result = 0;
		ch = scan.nextInt();
		switch (ch) {
		case 1:
			result = converter.convertToMeter(unit);
			break;
		case 2:
			result = converter.convertToFeet(unit);
			break;
		case 3:
			result = converter.convertToInch(unit);
			break;
		default:
			System.out.println("ERROR : Enter correct option!");
			return -1;
		}
		System.out.println(result);
		return 0;
	}

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("FROM");
		printer();
		if (init() == -1)
			return;
		System.out.println("TO");
		printer();
		Converter converter = new Converter();
		conversion(converter);
		if (scan != null)
			scan.close();
	}
}
