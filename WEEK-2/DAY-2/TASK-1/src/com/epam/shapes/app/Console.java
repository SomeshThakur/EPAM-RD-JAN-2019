package com.epam.shapes.app;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.epam.shapes.abstracts.Shape;
import com.epam.shapes.factory.ShapeFactory;
import com.epam.shapes.services.ShapeListService;

/**
 * The Class Console.
 *
 * @author Somesh_Thakur
 *
 */
public class Console {

	/**
	 * Gets the shape.
	 *
	 * @param shapesList the shapes list
	 * @return the shape
	 */
	public Shape getShape(List<String> shapesList) {
		Shape shape = null;
		if (shapesList.isEmpty()) {
			System.err.println("No shapes are available!");
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter shape Name:");
		for (int index = 0; index < shapesList.size(); index++) {
			System.out.println((index + 1) + ". " + shapesList.get(index));
		}

		int inputShapeIndex = scan.nextInt() - 1;

		if (inputShapeIndex > shapesList.size() || inputShapeIndex < 0)
			System.err.println("Wrong input");

		String shapeName = shapesList.get(inputShapeIndex);
		if (shapeName == null)
			System.err.println("Wrong input");
		scan.close();

		try {
			shape = ShapeFactory.createInstanceOfClass(shapeName);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException e) {
			e.printStackTrace();
		}
		return shape;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Console console = new Console();
		ShapeListService sls = new ShapeListService();
		Shape shape = console.getShape(sls.getList());
		if (shape == null)
			return;
		shape.draw();

	}
}
