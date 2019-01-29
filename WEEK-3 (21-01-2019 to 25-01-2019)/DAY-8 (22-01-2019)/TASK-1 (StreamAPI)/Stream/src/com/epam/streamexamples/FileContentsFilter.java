package com.epam.streamexamples;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
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
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String args[]) throws UnsupportedEncodingException {
		String root = System.getProperty("user.dir");
		printFilteredStrings(root);
	}

	/**
	 * Prints the filtered strings.
	 *
	 * @param root the root
	 * @throws UnsupportedEncodingException
	 */
	public static void printFilteredStrings(String root) throws UnsupportedEncodingException {
		URL url = Thread.currentThread().getContextClassLoader().getResource("stringTestFile");
		File stringTestFile = new File(URLDecoder.decode(url.getFile(), "UTF-8"));

		try (Stream<String> stream = Files.lines(stringTestFile.toPath())) {
			stream.filter(s -> s.toLowerCase().contains(FILTER)).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}