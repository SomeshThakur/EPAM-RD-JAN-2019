package com.epam.shapes.service;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.epam.shapes.exception.UnknownShapeException;

/**
 * Service class getting services of shapes
 * 
 * @author Somesh_Thakur
 */
public class ShapeListService {
	private List<String> shapeList;

	/**
	 * Load the file.
	 *
	 * @param shapesFileName file name
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void loadFile(String shapesFileName) throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource(shapesFileName);
		String path = URLDecoder.decode(url.getFile(), "UTF-8");
		File file = new File(path);
		Stream<String> stream = Files.lines(file.toPath());
		setShapeList(stream.collect(Collectors.toList()));
		stream.close();
	}

	/**
	 * Validates index.
	 *
	 * @param index the index
	 * @throws UnknownShapeException the index out of range exception
	 */
	public void validateIndex(int index) throws UnknownShapeException {
		if (!isValidIndex(index))
			throw new UnknownShapeException("Wrong Input");
	}

	/**
	 * Checks if is valid index.
	 *
	 * @param index the index
	 * @return true, if is valid index
	 */
	private boolean isValidIndex(int index) {
		return index < shapeList.size();
	}

	/**
	 * Gets the shape list.
	 *
	 * @return the shape list
	 */
	public List<String> getShapeList() {
		return shapeList;
	}

	/**
	 * Sets the shape list.
	 *
	 * @param shapeList the new shape list
	 */
	public void setShapeList(List<String> shapeList) {
		this.shapeList = shapeList;
	}
}
