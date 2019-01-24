package com.epam.shapes.factory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.stream.Stream;

import com.epam.shapes.abstracts.Shape;

/**
 * A factory for creating Shape objects.
 * 
 * @author Somesh_Thakur
 *
 */
public class ShapeFactory {

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
		if (!isValidShape(shapeName))
			return null;

		Class<?> classTemp = Class.forName("com.epam.shapes.models." + shapeName);
		Shape obj = (Shape) classTemp.newInstance();
		return obj;
	}

	private static boolean isValidShape(String shapeName) throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource("shapes.txt");
		File shapesFile = new File(url.getFile());
		try (Stream<String> stream = Files.lines(shapesFile.toPath())) {
			return stream.anyMatch(s -> s.equalsIgnoreCase(shapeName));
		}
	}
}