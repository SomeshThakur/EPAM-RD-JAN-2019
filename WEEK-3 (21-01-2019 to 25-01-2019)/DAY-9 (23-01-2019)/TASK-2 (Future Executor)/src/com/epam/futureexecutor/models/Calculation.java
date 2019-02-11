package com.epam.futureexecutor.models;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * The Class Calculation.
 *
 * @author Somesh_Thakur
 */
public class Calculation implements Callable<Integer> {

	/** The number list. */
	private final List<Integer> numberList;

	/**
	 * Instantiates a new calculation.
	 *
	 * @param numberList2 the number list
	 */
	public Calculation(List<Integer> numberList2) {
		this.numberList = numberList2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public Integer call() throws Exception {
		int result = 0;
		for (int number : numberList) {
			result += number;
		}
		return result;
	}
}
