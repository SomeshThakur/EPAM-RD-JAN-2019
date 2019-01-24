package com.epam.treeprint.visitors;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * The Class CustomVisitor.
 *
 * @author Somesh_Thakur
 */
public class CustomVisitor extends SimpleFileVisitor<Path> {

	/** The depth. */
	private int depth = 0;

	/**
	 * Prints the depth delim.
	 *
	 * @param delim the delim
	 */
	private void printDepthDelim(String delim) {
		for (int i = 0; i < depth; i++)
			System.out.print(delim);
	}

	/*
	 * 
	 * 
	 * @see java.nio.file.SimpleFileVisitor#preVisitDirectory(java.lang.Object,
	 * java.nio.file.attribute.BasicFileAttributes)
	 */
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		printDepthDelim("|	");
		System.out.println("+-	" + dir.getFileName() + "/");
		depth++;
		return super.preVisitDirectory(dir, attrs);
	}

	/*
	 * 
	 * 
	 * @see java.nio.file.SimpleFileVisitor#postVisitDirectory(java.lang.Object,
	 * java.io.IOException)
	 */
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

		printDepthDelim("|	");
		System.out.println();
		depth--;
		return super.postVisitDirectory(dir, exc);
	}

	/*
	 * 
	 * @see java.nio.file.SimpleFileVisitor#visitFile(java.lang.Object,
	 * java.nio.file.attribute.BasicFileAttributes)
	 */
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		printDepthDelim("|	");
		System.out.println("+-	" + file.getFileName());
		return super.visitFile(file, attrs);

	}

}
