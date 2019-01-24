package com.epam.someshthakur.calculator;

import java.util.Scanner;
import com.epam.someshthakur.constants.*;

/**
 * The Class Calculator.
 *
 * @author Somesh_Thakur
 */
public class Calculator {

	static int ch;
	private static int curr = 0, tmp = 0;
	private static Scanner scan;

	/**
	 * Adds the.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int add(int x, int y) {
		return x + y;
	}

	/**
	 * Subtraction.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int sub(int x, int y) {
		return x - y;
	}

	/**
	 * Multiplication.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int mul(int x, int y) {
		return x * y;
	}

	/**
	 * Division.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int div(int x, int y) {
		return x / y;
	}

	static void printMenu(int curr) {
		System.out.println("\n-----------------------------");
		System.out.println("[ " + curr + " ]");
		System.out.println("-----------------------------");
		System.out.println("1. Addition");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Clear");
		System.out.println("6. Exit");
		System.out.println("Enter your choice : ");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		do {
			printMenu(curr);
			ch = takeInput() - 1;
			operator(Operation.values()[ch]);
		} while (Operation.values()[ch] != Operation.EXIT);
	}

	private static void operator(Operation ch) {
		switch (ch) {
		case ADD:
			System.out.println("Enter Number : ");
			tmp = takeInput();
			curr = add(curr, tmp);
			break;
		case SUB:
			System.out.println("Enter Number : ");
			tmp = takeInput();
			curr = sub(curr, tmp);
			break;
		case MUL:
			System.out.println("Enter Number : ");
			tmp = takeInput();
			curr = mul(curr, tmp);
			break;
		case DIV:
			System.out.println("Enter Number : ");
			tmp = takeInput();
			curr = div(curr, tmp);
			break;
		case CLEAR:
			curr = 0;
			break;
		case EXIT:
			System.out.println("Good Bye!!");
			break;
		default:
			System.out.println("ERROR : Enter correct option!");
		}

	}

	private static int takeInput() {
		int ch = -1;
		try {
			ch = scan.nextInt();
		} catch (Exception e) {
			ch = -1;
			e.printStackTrace();
		}
		return ch;
	}
}