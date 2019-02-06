package com.epam.bank.bean;

import com.epam.bank.service.CustomerIdGenerator;
import com.epam.bank.util.GenderType;

public class Customer {
	private String name;
	private int age;
	private GenderType gender;
	private final int id;

	public Customer() {
		id = CustomerIdGenerator.generate();
	}

	public Customer(Customer customer) {
		setName(customer.name);
		setAge(customer.age);
		setGender(customer.gender);
		this.id = customer.getId();
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderType getGender() {
		return gender;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
