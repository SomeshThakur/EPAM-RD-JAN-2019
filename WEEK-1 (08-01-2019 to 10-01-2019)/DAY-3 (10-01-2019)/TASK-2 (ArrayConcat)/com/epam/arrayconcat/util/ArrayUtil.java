package com.epam.arrayconcat.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtil {
	/**
	 * Join.
	 *
	 * @param array the array
	 * @return the string
	 * 
	 * 
	 * 
	 */
	public String join(Integer array[]) {
		return join(array, ",");
	}

	/**
	 * Join.
	 *
	 * @param array     the array
	 * @param delimiter the delimiter
	 * @return the string
	 */
	public String join(Integer array[], String delimiter) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int index = 0; index < array.length; index++) {
			if (index != array.length - 1) {
				stringBuffer.append("" + array[index] + delimiter);
			} else {
				stringBuffer.append("" + array[index]);
			}
		}
		return stringBuffer.toString();

	}

	public String joinJava8(Integer array[], String delimiter) {
		List<Integer> arrayList = Arrays.asList(array);
		return arrayList.stream().map(number -> String.valueOf(number)).collect(Collectors.joining(delimiter));
	}

}
