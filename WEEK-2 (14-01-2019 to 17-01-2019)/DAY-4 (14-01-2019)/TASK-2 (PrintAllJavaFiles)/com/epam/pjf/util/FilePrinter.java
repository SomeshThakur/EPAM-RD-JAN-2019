package com.epam.pjf.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.stream.Stream;

import com.epam.pjf.exception.InvalidFilePathException;

/**
 * The Class FilePrinter.
 *
 * @author Somesh_Thakur
 */
public class FilePrinter {

	/**
	 * Prints the java files.
	 *
	 * @param givenDir the given dir
	 * @throws InvalidFilePathException     the invalid file path exception
	 * @throws UnsupportedEncodingException
	 */
	public void printAllFiles(final String givenDir, final String extension)
			throws InvalidFilePathException, UnsupportedEncodingException {
		String path = URLDecoder.decode(givenDir, "UTF-8");
		File file = new File(path);
		if (!file.isDirectory()) {
			throw new InvalidFilePathException("Given path was not a directory!");
		}
		String list[] = file.list();
		Stream.of(list).forEach((fileName) -> {
			printIfEndsWith(fileName, extension);
		});
	}

	public void printAllFiles(final String givenDir) throws InvalidFilePathException, UnsupportedEncodingException {
		String path = URLDecoder.decode(givenDir, "UTF-8");
		File file = new File(path);
		if (!file.isDirectory()) {
			throw new InvalidFilePathException("Given path was not a directory!");
		}
		String list[] = file.list();
		Stream.of(list).forEach((fileName) -> {
			printIfEndsWith(fileName, "");
		});
	}

	/**
	 * Prints the if ends with.
	 *
	 * @param fileName the file name
	 */
	private void printIfEndsWith(String fileName, String extension) {
		if (fileName.endsWith(extension)) {
			System.out.println(fileName);
		}
	}
}
