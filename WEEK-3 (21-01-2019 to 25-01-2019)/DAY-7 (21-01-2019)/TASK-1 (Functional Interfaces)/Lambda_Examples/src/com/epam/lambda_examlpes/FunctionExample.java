package com.epam.lambda_examlpes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * The Class FunctionExample.
 */
public class FunctionExample {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
	FunctionExample functionExample = new FunctionExample();
	String[] strArr = { "", "Hello", "", "World", "I", "am", "practicing", "lambda", "and", "predicate.", "", };
	List<String> strList = Arrays.asList(strArr);
	System.out.println("Intial List :" + strList);
	List<Integer> lenghthList = functionExample.eval(strList, (str) -> str.length());
	System.out.println("Lengths of all elements in list are : " + lenghthList);
    }

    /**
     * Evaluate the function.
     *
     * @param strList  the str list
     * @param function the function
     * @return the list
     */
    private List<Integer> eval(List<String> strList, Function<String, Integer> function) {
	List<Integer> resulList = new ArrayList<Integer>();
	for (String str : strList) {
	    resulList.add(function.apply(str));
	}
	return resulList;
    }
}
