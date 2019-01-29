package com.epam.streamexamples;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
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
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String root = System.getProperty("user.dir");
		printDistinctStrings(root);
	}

	/**
	 * Prints the distinct strings.
	 *
	 * @param root the root
	 * @throws UnsupportedEncodingException
	 */
	private static void printDistinctStrings(String root) throws UnsupportedEncodingException {
		URL url = Thread.currentThread().getContextClassLoader().getResource("studentNames");
		File studentNames = new File(URLDecoder.decode(url.getFile(), "UTF-8"));

		try (Stream<String> stream = Files.lines(studentNames.toPath())) {
			stream.distinct().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
