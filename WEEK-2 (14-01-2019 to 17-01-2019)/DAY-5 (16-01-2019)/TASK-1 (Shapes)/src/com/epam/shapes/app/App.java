package com.epam.shapes.app;

import java.io.IOException;

import com.epam.shapes.exception.UnknownShapeException;
import com.epam.shapes.factory.ShapeFactory;
import com.epam.shapes.model.Shape;
import com.epam.shapes.service.ShapeListService;

/**
 * contains main method
 * 
 * @author Somesh_Thakur
 */
public class App {

	public static void main(String[] args) throws IOException, UnknownShapeException, ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		ShapeListService service = new ShapeListService();
		service.loadFile("shapes.txt");
		Console.printShapeList(service.getShapeList());
		Console.printlnString("Enter index of shape to be drawn : ");
		int shapeIndex = Console.getIntInput() - 1;
		service.validateIndex(shapeIndex);
		String shapeName = service.getShapeList().get(shapeIndex);
		Shape shape = ShapeFactory.createInstanceOfClass(shapeName);
		Console.drawShape(shape);
	}

}
