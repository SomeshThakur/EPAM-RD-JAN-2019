package com.epam.lambda_examlpes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * The Class PredicateExample.
 */
public class PredicateExample {

	/**
	 * Filter the list according to predicate.
	 *
	 * @param strList   the string list
	 * @param predicate the predicate
	 * @return the list
	 */
	public List<String> filter(List<String> strList, Predicate<String> predicate) {
		List<String> resultList = new ArrayList<>();
		for (String str : strList) {
			if (predicate.test(str))
				resultList.add(str);
		}
		return resultList;
	}
}
