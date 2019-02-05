package com.epam.lambda_examlpes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * The Class FunctionExample.
 */
public class FunctionExample {

	/**
	 * Evaluate the function.
	 *
	 * @param strList  the str list
	 * @param function the function
	 * @return the list
	 */
	public List<Integer> eval(List<String> strList, Function<String, Integer> function) {
		List<Integer> resulList = new ArrayList<Integer>();
		for (String str : strList) {
			resulList.add(function.apply(str));
		}
		return resulList;
	}
}
