package com.epam.streams;


import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
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
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		DistinctStringStream distinctStringStream = new DistinctStringStream();
		List<String> files = distinctStringStream.getDistinctStrings("studentNames");
		distinctStringStream.printList(files);
	}

	/**
	 * Prints the distinct strings.
	 *
	 * @param fileName the root
	 * @return the distinct strings
	 * @throws IOException 
	 */
	private List<String> getDistinctStrings(String fileName) throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource(fileName);
		File studentNames = new File(URLDecoder.decode(url.getFile(), "UTF-8"));

		try (Stream<String> stream = Files.lines(studentNames.toPath())) {
			return stream.distinct().collect(Collectors.toList());
		} catch (IOException e) {
			throw e;
		}
	}

	/**
	 * Prints the list.
	 *
	 * @param list the list
	 */
	private void printList(List<String> list) {
		list.stream().forEach(System.out::println);
	}

}
