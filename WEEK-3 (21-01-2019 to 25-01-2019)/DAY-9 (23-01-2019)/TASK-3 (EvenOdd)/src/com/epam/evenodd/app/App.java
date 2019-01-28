package com.epam.evenodd.app;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.locks.ReentrantLock;

import com.epam.evenodd.models.Even;
import com.epam.evenodd.models.Odd;
import com.epam.evenodd.models.Printer;

/**
 * The Class App.
 *
 * @author Somesh_Thakur
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws InterruptedException         the interrupted exception
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException {
		ReentrantLock reentrantLock = new ReentrantLock(true);
		Printer printer = new Printer(reentrantLock);
		Even even = new Even(printer, 11);
		Odd odd = new Odd(printer, 11);
		Thread t1 = new Thread(even);
		Thread t2 = new Thread(odd);
		t2.start();
		t1.start();
	}
}
