package com.epam.unitconvertor.app;

import java.util.Scanner;

import com.epam.unitconvertor.interfaces.Unit;
import com.epam.unitconvertor.models.Feet;
import com.epam.unitconvertor.models.Inch;
import com.epam.unitconvertor.models.Meter;
import com.epam.unitconvertor.utilities.Converter;

/**
 * The Class ConverterMain.
 * 
 * @author Somesh_Thakur
 */
public class ConverterMain {

	/** The choice. */
	protected static int ch;

	/** The value. */
	protected static double value;

	/** The unit. */
	protected static Unit unit;

	/** The scan. */
	protected static Scanner scan = null;

	/**
	 * Printer to print menu.
	 */
	public static void printer() {
		System.out.println("-----------------------------");
		System.out.println("1. Meter");
		System.out.println("2. Feet");
		System.out.println("3. Inch");
		System.out.println("Enter your length unit : ");
	}

	/**
	 * Inits the unit.
	 *
	 * @return the int
	 */
	public static int initUnit() {
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

	/**
	 * Conversion.
	 *
	 * @param converter the converter
	 * @return the int
	 */
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

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("FROM");
		printer();
		if (initUnit() == -1)
			return;
		System.out.println("TO");
		printer();
		Converter converter = new Converter();
		conversion(converter);
		if (scan != null)
			scan.close();
	}
}
