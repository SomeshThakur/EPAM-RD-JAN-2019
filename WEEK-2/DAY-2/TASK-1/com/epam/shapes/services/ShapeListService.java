package com.epam.shapes.services;

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
		String root = System.getProperty("user.dir");
		try (Stream<String> stream = Files.lines(Paths.get(root + "/shapes.txt"))) {
			return stream.collect(Collectors.toList());
		} catch (Exception e) {
			return null;
		}
	}
}
