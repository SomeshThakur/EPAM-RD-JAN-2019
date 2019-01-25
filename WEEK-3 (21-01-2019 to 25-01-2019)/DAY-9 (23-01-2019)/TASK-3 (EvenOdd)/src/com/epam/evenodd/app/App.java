package com.epam.evenodd.app;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.locks.ReentrantLock;

import com.epam.evenodd.models.Even;
import com.epam.evenodd.models.Odd;
import com.epam.evenodd.models.Printer;

public class App {
	public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException {
		Printer printer = new Printer();
		ReentrantLock reentrantLock = new ReentrantLock(true);
		Even even = new Even(reentrantLock, printer);
		Odd odd = new Odd(reentrantLock, printer);
		Thread t1 = new Thread(even);
		Thread t2 = new Thread(odd);

		t2.start();
		t1.start();
	}
}
