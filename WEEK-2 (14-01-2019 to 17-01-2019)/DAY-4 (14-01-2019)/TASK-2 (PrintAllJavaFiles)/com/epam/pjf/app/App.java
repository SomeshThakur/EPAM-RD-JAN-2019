package com.epam.pjf.app;

import java.io.UnsupportedEncodingException;

import com.epam.pjf.exception.InvalidFilePathException;
import com.epam.pjf.util.FilePrinter;

/**
 * The Class ListAllJavaFiles.
 *
 * @author Somesh_Thakur
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws InvalidFilePathException
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String args[]) throws InvalidFilePathException, UnsupportedEncodingException {
		final String givenDir = args[0];
		FilePrinter fp = new FilePrinter();
		fp.printAllFiles(givenDir, ".java");
	}
}