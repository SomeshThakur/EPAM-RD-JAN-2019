package com.epam.someshthakur.streamexamples;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * The Class DistinctStringStream.
 *
 * @author Somesh_Thakur
 *
 */
public class DistinctStringStream {
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String root = System.getProperty("user.dir");
		printDistinctStrings(root);
	}

	/**
	 * Prints the distinct strings.
	 *
	 * @param root the root
	 */
	private static void printDistinctStrings(String root) {
		URL url = Thread.currentThread().getContextClassLoader().getResource("studentNames");
		File studentNames = new File(url.getFile());

		try (Stream<String> stream = Files.lines(studentNames.toPath())) {
			stream.distinct().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
