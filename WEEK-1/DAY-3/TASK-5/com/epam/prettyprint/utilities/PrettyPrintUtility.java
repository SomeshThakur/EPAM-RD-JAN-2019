package com.epam.prettyprint.utilities;

/**
 * The Class PrettyPrintUtility.
 * 
 * @author Somesh_Thakur
 *
 */
public class PrettyPrintUtility {

	/**
	 * Display matrix.
	 *
	 * @param matrix the matrix
	 * @return the string
	 */
	public static String displayMatrix(int[][] matrix) {
		StringBuffer sb = new StringBuffer();
		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for (int colIndex = 0; colIndex < matrix[rowIndex].length; colIndex++) {
				sb.append(matrix[rowIndex][colIndex] + " ");
			}
			sb.append("\n");
		}
		return sb.toString();

	}
}
