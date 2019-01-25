package com.epam.evenodd.models;

import java.util.concurrent.locks.ReentrantLock;

public class Odd implements Runnable {
	ReentrantLock reentrantLock;
	Printer printer;

	public Odd(ReentrantLock reentrantLock, Printer printer) {
		this.reentrantLock = reentrantLock;
		this.printer = printer;
	}

	@Override
	public void run() {
		for (int i = 1; i < 11; i += 2) {
			reentrantLock.lock();
			printer.print(i);
			reentrantLock.unlock();
		}

	}
}
