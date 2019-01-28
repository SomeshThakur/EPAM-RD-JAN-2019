package com.epam.evenodd.models;

import java.util.concurrent.locks.ReentrantLock;

/**
 * The Class Printer.
 *
 * @author Somesh_Thakur
 */
public class Printer {

	/** The reentrant lock. */
	ReentrantLock reentrantLock;

	/**
	 * Instantiates a new printer.
	 *
	 * @param reentrantLock the reentrant lock
	 */
	public Printer(ReentrantLock reentrantLock) {
		this.reentrantLock = reentrantLock;
	}

	/**
	 * Prints the.
	 *
	 * @param value the value
	 */
	public void print(int value) {
		reentrantLock.lock();
		System.out.println(value);
		reentrantLock.unlock();
	}
}
