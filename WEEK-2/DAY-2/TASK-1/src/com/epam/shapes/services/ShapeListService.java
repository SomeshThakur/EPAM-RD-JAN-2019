package com.epam.shapes.services;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class ShapeListService.
 */
public class ShapeListService {

	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public List<String> getList() {
		URL url = Thread.currentThread().getContextClassLoader().getResource("shapes.txt");
		File shapesFile = new File(url.getFile());
		String root = System.getProperty("user.dir");
		try (Stream<String> stream = Files.lines(shapesFile.toPath())) {
			return stream.collect(Collectors.toList());
		} catch (Exception e) {
			return null;
		}
	}
}
