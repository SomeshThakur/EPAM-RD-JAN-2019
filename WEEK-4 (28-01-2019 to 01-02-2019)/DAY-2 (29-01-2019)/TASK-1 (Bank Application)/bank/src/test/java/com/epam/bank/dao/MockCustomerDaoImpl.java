package com.epam.bank.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.epam.bank.bean.Customer;
import com.epam.bank.exception.CustomerNotFoundException;
import com.epam.bank.exception.InvalidCustomer;
import com.epam.bank.service.CustomerValidator;
import com.epam.bank.util.GenderType;

public class MockCustomerDaoImpl implements CustomerDao {
	List<Customer> customers;
	Supplier<CustomerNotFoundException> supplier = () -> {
		return new CustomerNotFoundException("ID Doesnot Exits");
	};

	public MockCustomerDaoImpl() {
		customers = new ArrayList<Customer>();
	}

	@Override
	public Customer createCustomer(String name, int age, GenderType gender) throws InvalidCustomer {
		Customer customer = new Customer();
		customer.setName(name);
		customer.setAge(age);
		customer.setGender(gender);
		customers.add(customer);
		if (!CustomerValidator.verify(customer))
			throw new InvalidCustomer("Invalid Details");
		return new Customer(customer);
	}

	@Override
	public Customer getCustomerById(int id) throws CustomerNotFoundException {
		return customers.stream().filter(findCustomer(id)).findAny().orElseThrow(supplier);
	}

	private Predicate<? super Customer> findCustomer(int id) {
		return customer -> customer.getId() == id;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws CustomerNotFoundException {
		Customer oldCustomer = getCustomerById(customer.getId());
		customers.remove(oldCustomer);
		return customers.add(new Customer(customer));
	}

}
