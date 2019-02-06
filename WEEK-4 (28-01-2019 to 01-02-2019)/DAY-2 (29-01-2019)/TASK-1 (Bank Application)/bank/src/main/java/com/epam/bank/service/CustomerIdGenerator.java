package com.epam.bank.service;

public class CustomerIdGenerator {
	private static int count;

	public static int generate() {
		return ++count;
	}

}
