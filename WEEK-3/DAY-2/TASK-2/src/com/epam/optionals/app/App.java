package com.epam.optionals.app;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

import com.epam.optionals.exceptions.CustomException;
import com.epam.optionals.utility.TestOptionals;

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
	 */
	public static void main(String[] args) {
		String nameNotNull = "John";
		String nameNull = null;
		System.out.println("------------------------------------------");
		System.out.println("Testing Not Null Value ");
		TestOptionals to = new TestOptionals();
		System.out.println(to.testOrElse(nameNotNull));
		System.out.println(to.testOrElseGet(nameNotNull));
		try {
			System.out.println(to.testOrElseThrow((nameNotNull)));
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(to.testFilter(nameNotNull));
		} catch (NoSuchElementException e) {
			System.out.println("Filter didnt found anything");
		}
		System.out.println(to.testMap(nameNotNull));
		System.out.println("------------------------------------------");
		System.out.println("Testing Null Value ");
		System.out.println(to.testOrElse(nameNull));
		System.out.println(to.testOrElseGet(nameNull));
		try {
			System.out.println(to.testOrElseThrow((nameNull)));
			System.out.println(to.testFilter(nameNull));
			System.out.println(to.testMap(nameNull));
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
