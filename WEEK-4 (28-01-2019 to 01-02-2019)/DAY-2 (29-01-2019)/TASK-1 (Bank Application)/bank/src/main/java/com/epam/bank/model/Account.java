package com.epam.bank.model;

public class Account {
	private int accountNumber;
	private double balance;
	
	public Account(String firstName, String lastName, int age, String address) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setAddress(address);
	}

	
	public int getBalance() {
		return 0;
	}

}
