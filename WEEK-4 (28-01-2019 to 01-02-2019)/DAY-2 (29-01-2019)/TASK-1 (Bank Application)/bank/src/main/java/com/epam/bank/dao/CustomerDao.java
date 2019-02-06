package com.epam.bank.dao;

import com.epam.bank.bean.Customer;
import com.epam.bank.exception.CustomerNotFoundException;
import com.epam.bank.exception.InvalidCustomer;
import com.epam.bank.util.GenderType;

public interface CustomerDao {

	Customer createCustomer(String name, int age, GenderType gender) throws InvalidCustomer;

	Customer getCustomerById(int id) throws CustomerNotFoundException;

	boolean updateCustomer(Customer customer) throws CustomerNotFoundException;
}
