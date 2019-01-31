package com.epam.shapes.app;

import java.util.List;
import java.util.Scanner;

import com.epam.shapes.model.Shape;

/**
 * Console class for input and output.
 * 
 * @author Nishant_Bansal
 */
/**
 * @author Somesh_Thakur
 *
 */
public class Console {

	/**
	 * Gets the input in integer.
	 *
	 * @return the int input
	 */
	public static int getIntInput() {
		int shapeNumber;
		try (Scanner scanner = new Scanner(System.in)) {
			shapeNumber = scanner.nextInt();
		}
		return shapeNumber;
	}

	/**
	 * Draws shape.
	 *
	 * @param shape the shape
	 */
	public static void drawShape(Shape shape) {
		shape.draw();
	}

	/**
	 * Prints the shape list.
	 *
	 * @param shapeNamesList list of shapes
	 */
	public static void printShapeList(List<String> shapeNamesList) {
		for (String shapeName : shapeNamesList) {
			System.out.println((shapeNamesList.indexOf(shapeName) + 1) + " " + shapeName);
		}
	}

	/**
	 * Prints the string.
	 *
	 * @param str the str
	 */
	public static void printlnString(String str) {
		System.out.println(str);
	}
}
