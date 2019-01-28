package com.epam.evenodd.models;

/**
 * The Class Odd.
 *
 * @author Somesh_Thakur
 */
public class Odd implements Runnable {

	/** The max numbers. */
	int maxNumbers;

	/** The printer. */
	Printer printer;

	/**
	 * Instantiates a new odd.
	 *
	 * @param printer    the printer
	 * @param maxNumbers the max numbers
	 */
	public Odd(Printer printer, int maxNumbers) {

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
		for (int i = 1; i < maxNumbers; i += 2) {

			printer.print(i);

		}

	}
}
