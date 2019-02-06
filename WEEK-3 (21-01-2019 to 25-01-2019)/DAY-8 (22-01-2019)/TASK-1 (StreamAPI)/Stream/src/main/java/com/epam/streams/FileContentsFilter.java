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
 * The Class StreamFilter.
 */
public class FileContentsFilter {

	/**
	 * Prints the filtered strings.
	 *
	 * @param root the root
	 * @return
	 * @throws IOException
	 */
	public List<String> printFilteredStrings(String fileName, String filter) throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource(fileName);
		String path = URLDecoder.decode(url.getFile(), "UTF-8");
		File stringTestFile = new File(path);

		try (Stream<String> stream = Files.lines(stringTestFile.toPath())) {
			return stream.filter(s -> s.toLowerCase().contains(filter)).collect(Collectors.toList());
		}
	}

}