package com.epam.streams;

import java.io.File;
import java.io.IOException;
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
	 * Prints the distinct strings.
	 *
	 * @param fileName the root
	 * @return the distinct strings
	 * @throws IOException
	 */
	public List<String> getDistinctStrings(String fileName) throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource(fileName);
		String path = URLDecoder.decode(url.getFile(), "UTF-8");
		File studentNames = new File(path);

		try (Stream<String> stream = Files.lines(studentNames.toPath())) {
			return stream.distinct().collect(Collectors.toList());
		} 
	}
}
