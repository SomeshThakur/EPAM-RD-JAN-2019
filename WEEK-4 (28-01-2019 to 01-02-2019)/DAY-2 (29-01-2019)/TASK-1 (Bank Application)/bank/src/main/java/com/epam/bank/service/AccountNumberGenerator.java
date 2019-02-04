package com.epam.bank.service;

public class AccountNumberGenerator {
	private static int accountNum;

	public static int generate() {
		return ++accountNum;
	}
}
