package com.epam.evenodd.models;

/**
 * The Class Even.
 *
 * @author Somesh_Thakur
 */
public class Even implements Runnable {

	/** The printer. */
	Printer printer;

	/** The max numbers. */
	int maxNumbers;

	/**
	 * Instantiates a new even.
	 *
	 * @param printer    the printer
	 * @param maxNumbers the max numbers
	 */
	public Even(Printer printer, int maxNumbers) {
		this.printer = printer;
		this.maxNumbers = maxNumbers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 2; i < maxNumbers; i += 2) {
			printer.print(i);
		}
	}
}
