package com.epam.shapes.factory;

import java.io.IOException;

import com.epam.shapes.model.Shape;

/**
 * A factory for creating Shape objects.
 * 
 * @author Somesh_Thakur
 *
 */
public class ShapeFactory {
	private final static String SHAPE_MODEL_PACKAGE = "com.epam.shapes.model";

	/**
	 * Creates a new Shape object.
	 *
	 * @param className the class name
	 * @return the shape
	 * @throws ClassNotFoundException the class not found exception
	 * @throws InstantiationException the instantiation exception
	 * @throws IllegalAccessException the illegal access exception
	 * @throws IOException
	 */
	public static Shape createInstanceOfClass(String shapeName)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		return (Shape) Class.forName(SHAPE_MODEL_PACKAGE + "." + shapeName).newInstance();
	}
}
