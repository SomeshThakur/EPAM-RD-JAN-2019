package com.epam.treeprint.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import com.epam.treeprint.visitors.CustomVisitor;

/**
 * The Class DirectoryTree.
 *
 * @author Somesh_Thakur
 */
public class App{

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.err.println("Error enter directory path as arg");
			return;
		}
		CustomVisitor myPathVisitor = new CustomVisitor();
		File tempFile = new File(args[0]);
		if (!tempFile.isDirectory()) {
			System.err.println("Error enter correct directory");
			return;
		}
		Path myDir = tempFile.toPath();
		Files.walkFileTree(myDir, myPathVisitor);
	}
}
