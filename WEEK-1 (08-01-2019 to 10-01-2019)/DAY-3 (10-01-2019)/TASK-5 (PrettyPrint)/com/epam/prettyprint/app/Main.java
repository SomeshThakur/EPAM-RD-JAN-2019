package com.epam.prettyprint.app;

import java.util.Scanner;

import com.epam.prettyprint.utilities.PrettyPrintUtility;

/**
 * The Class Main.
 *
 * @author Somesh_Thakur
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		int row, col;
		Main m = new Main();
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter number of rows : ");
			row = scan.nextInt();
			System.out.println("Enter number of cols : ");
			col = scan.nextInt();
			System.out.println("Enter Matrix elements : ");
			int matrix[][] = m.readMatrix(row, col, scan);
			System.out.println("The Matrix elements are ");
			System.out.println(PrettyPrintUtility.displayMatrix((matrix)));
		}
	}

	/**
	 * Read matrix.
	 *
	 * @param row  the row
	 * @param col  the col
	 * @param scan the scan
	 * @return the int[][]
	 */
	private int[][] readMatrix(int row, int col, Scanner scan) {
		int matrix[][] = new int[row][col];
		for (int rowIndex = 0; rowIndex < row; rowIndex++) {
			for (int colIndex = 0; colIndex < col; colIndex++) {
				System.out.print("Matrix[" + rowIndex + "][" + colIndex + "] = ");
				matrix[rowIndex][colIndex] = scan.nextInt();
			}
		}
		return matrix;
	}
}
