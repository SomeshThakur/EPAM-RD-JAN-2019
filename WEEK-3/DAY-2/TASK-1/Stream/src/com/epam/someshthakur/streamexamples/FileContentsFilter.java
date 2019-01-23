package com.epam.someshthakur.streamexamples;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * The Class StreamFilter.
 */
public class FileContentsFilter {

	/** The Constant FILTER. */
	private final static String FILTER = "java";

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		String root = System.getProperty("user.dir");
		printFilteredStrings(root);
	}

	/**
	 * Prints the filtered strings.
	 *
	 * @param root the root
	 */
	public static void printFilteredStrings(String root) {
		URL url = Thread.currentThread().getContextClassLoader().getResource("stringTestFile");
		File stringTestFile = new File(url.getFile());

		try (Stream<String> stream = Files.lines(stringTestFile.toPath())) {
			stream.filter(s -> s.toLowerCase().contains(FILTER)).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}