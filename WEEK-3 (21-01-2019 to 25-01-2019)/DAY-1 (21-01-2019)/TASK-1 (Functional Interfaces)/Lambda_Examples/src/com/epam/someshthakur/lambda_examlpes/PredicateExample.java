package com.epam.someshthakur.lambda_examlpes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * The Class PredicateExample.
 */
public class PredicateExample {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
	PredicateExample predicateExample = new PredicateExample();
	String[] strArr = { "", "Hello", "", "World", "I", "am", "practicing", "lambda", "and", "predicate.", "", };
	List<String> strList = Arrays.asList(strArr);
	System.out.println("Intial List :" + strList);
	List<String> aList = predicateExample.filter(strList, (String str) -> str.startsWith("a"));
	System.out.println("Elements that starts with a are : " + aList);
	List<String> listNullRemoved = predicateExample.filter(strList, (String str) -> !str.isEmpty());
	System.out.println("List with null removed : " + listNullRemoved);
    }

    /**
     * Filter the list according to predicate.
     *
     * @param strList   the string list
     * @param predicate the predicate
     * @return the list
     */
    private List<String> filter(List<String> strList, Predicate<String> predicate) {
	List<String> resultList = new ArrayList<>();
	for (String str : strList) {
	    if (predicate.test(str))
		resultList.add(str);
	}
	return resultList;
    }
}
