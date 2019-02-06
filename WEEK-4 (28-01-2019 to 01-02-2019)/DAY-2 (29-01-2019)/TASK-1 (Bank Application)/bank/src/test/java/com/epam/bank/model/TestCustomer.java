package com.epam.bank.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.bank.bean.Customer;
import com.epam.bank.dao.CustomerDao;
import com.epam.bank.dao.MockCustomerDaoImpl;
import com.epam.bank.exception.CustomerNotFoundException;
import com.epam.bank.exception.InvalidCustomer;
import com.epam.bank.service.CustomerValidator;
import com.epam.bank.util.GenderType;

/**
 * The Class TestCustomer.
 *
 * @author Somesh_Thakur
 */
class TestCustomer {

	/** The customer. */
	Customer customer;

	/** The customer dao. */
	static CustomerDao customerDao;

	/**
	 * Inits.
	 */
	@BeforeAll
	public static void init() {
		customerDao = new MockCustomerDaoImpl();
	}

	/**
	 * Test valid details customer.
	 *
	 * @throws InvalidCustomer the invalid customer
	 */
	@Test
	@DisplayName("Test Valid Details Customer Creation")
	public void testValidDetailsCustomer() throws InvalidCustomer {
		String name = "Somesh Thakur";
		int age = 21;
		Customer customer = customerDao.createCustomer(name, age, GenderType.MALE);
		assertTrue(CustomerValidator.verify(customer));
	}

	/**
	 * Test in valid details customer.
	 */
	@Test
	@DisplayName("Test Invalid Details Customer Creation")
	public void testInValidDetailsCustomer() {
		String name = "abc";
		int age = 0;
		assertThrows(InvalidCustomer.class, () -> customerDao.createCustomer(name, age, GenderType.MALE));
	}

	/**
	 * Test customer deletion.
	 *
	 * @throws InvalidCustomer the invalid customer
	 */
	@Test
	@DisplayName("Test Customer Invalid ID retrieve")
	public void testCustomerDeletion() throws InvalidCustomer {
		assertThrows(CustomerNotFoundException.class, () -> customerDao.getCustomerById(-1));
	}

	/**
	 * Test customer details updation.
	 *
	 * @throws InvalidCustomer           the invalid customer
	 * @throws CustomerNotFoundException the customer not found exception
	 */
	@Test
	@DisplayName("Test Customer Details Updation")
	public void testCustomerDetailsUpdation() throws InvalidCustomer, CustomerNotFoundException {
		String name = "Somesh Thakur";
		int age = 21;
		Customer customer = customerDao.createCustomer(name, age, GenderType.MALE);
		customer.setName("XYZASGFDGHS");
		customerDao.updateCustomer(customer);
		Customer customerRetrieved = customerDao.getCustomerById(customer.getId());
		assertEquals(customer.getName(), customerRetrieved.getName());
	}
}
