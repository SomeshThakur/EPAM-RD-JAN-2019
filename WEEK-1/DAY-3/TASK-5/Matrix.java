import java.util.Scanner;

public class Matrix {
	public static void main(String args[]) {
		int row, col;
		Matrix m = new Matrix();
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter number of rows : ");
			row = scan.nextInt();
			System.out.println("Enter number of cols : ");
			col = scan.nextInt();
			System.out.println("Enter Matrix elements : ");
			int matrix[][] = m.readMatrix(row, col, scan);
			System.out.println("The Matrix elements are ");
			displayMatrix(matrix, row, col);
		}
	}

	private static void displayMatrix(int[][] matrix, int row, int col) {
		for (int rowIndex = 0; rowIndex < row; rowIndex++) {
			for (int colIndex = 0; colIndex < col; colIndex++) {
				System.out.print(matrix[rowIndex][colIndex] + " ");
			}
			System.out.println();
		}

	}

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
