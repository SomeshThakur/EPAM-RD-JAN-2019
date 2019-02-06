package com.epam.bank.service;

import java.util.stream.Stream;

import com.epam.bank.bean.Customer;
import com.epam.bank.constants.CustomerContants;
import com.epam.bank.util.GenderType;

public class CustomerValidator {

	public static boolean verify(Customer customer) {
		return verifyName(customer.getName()) && verifyAge(customer.getAge()) && verifyGender(customer.getGender());
	}

	private static boolean verifyGender(GenderType gender) {
		return Stream.of(GenderType.values()).anyMatch(g -> g == gender);
	}

	private static boolean verifyAge(int age) {
		return age < CustomerContants.MAX_AGE && age >= CustomerContants.MIN_AGE;
	}

	private static boolean verifyName(String name) {
		return (name.length() > CustomerContants.MIN_NAME_LENGTH && name.length() < CustomerContants.MAX_NAME_LENGTH);
	}

}
