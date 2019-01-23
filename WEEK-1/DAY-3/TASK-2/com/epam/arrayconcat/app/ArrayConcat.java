package com.epam.arrayconcat.app;

/**
 * The Class ArrayConcat.
 *
 * @author Somesh_Thakur
 */
public class ArrayConcat {

	/**
	 * Join.
	 *
	 * @param array the array
	 * @return the string
	 * 
	 * 
	 * 
	 */
	public String join(int array[]) {
		return join(array, ',');
	}

	/**
	 * Join.
	 *
	 * @param array     the array
	 * @param delimiter the delimiter
	 * @return the string
	 */
	public String join(int array[], char delimiter) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int index = 0; index < array.length; index++) {
			if (index != array.length - 1)
				stringBuffer.append("" + array[index] + delimiter + " ");
			else
				stringBuffer.append("" + array[index]);

		}
		return stringBuffer.toString();

	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		ArrayConcat ac = new ArrayConcat();
		System.out.println(ac.join(arr, '!'));
	}
}