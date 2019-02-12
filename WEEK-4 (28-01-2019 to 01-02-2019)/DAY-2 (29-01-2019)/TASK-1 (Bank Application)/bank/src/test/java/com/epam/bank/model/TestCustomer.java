package com.epam.bank.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.epam.bank.bean.Customer;
import com.epam.bank.dao.CustomerDao;
import com.epam.bank.dao.MockCustomerDaoImpl;
import com.epam.bank.exception.CustomerNotFoundException;
import com.epam.bank.exception.InvalidCustomer;
import com.epam.bank.service.CustomerService;
import com.epam.bank.util.GenderType;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

/**
 * The Class TestCustomer.
 *
 * @author Somesh_Thakur
 */
class TestCustomer {

  /** The customer. */
  Customer customer;

  /** The customer dao. */
  static CustomerService customerService;

  /** The customer dao. */
  static CustomerDao customerDao;

  /**
   * Inits.
   */
  @BeforeAll
  public static void init() {
    customerService = new CustomerService();
    customerDao = new MockCustomerDaoImpl();
    customerService.setCustomerDao(customerDao);
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
    Customer customer = customerService.createCustomer(name, age, GenderType.MALE);
    assertNotNull(customer);
    assertEquals(GenderType.MALE, customer.getGender());
  }

  /**
   * Test in valid customer name.
   */
  @Test
  @DisplayName("Test Invalid Customer Name Validation")
  public void testInValidCustomerName() {
    String name = "abc";
    int age = 0;
    assertThrows(InvalidCustomer.class, createCustomer(name, age));
  }

  /**
   * Test in valid customer age max.
   */
  @Test
  @DisplayName("Test Invalid Customer Age Max Validation")
  public void testInValidCustomerAgeMax() {
    String name = "abcdef";
    int age = 10000;
    assertThrows(InvalidCustomer.class, createCustomer(name, age));
  }

  /**
   * Test in valid customer age min.
   */
  @Test
  @DisplayName("Test Invalid Customer Min Validation")
  public void testInValidCustomerAgeMin() {
    String name = "abcasdsfdvgdfvdsfdfs";
    int age = 0;
    assertThrows(InvalidCustomer.class, createCustomer(name, age));
  }

  /**
   * Creates the customer.
   *
   * @param name the name
   * @param age  the age
   * @return the executable
   */
  private Executable createCustomer(String name, int age) {
    return () -> customerService.createCustomer(name, age, GenderType.MALE);
  }

  /**
   * Test in valid customer age.
   */
  @Test
  @DisplayName("Test Invalid Customer Age Validation")
  public void testInValidCustomerAge() {
    String name = "Somesh Thakur";
    int age = 0;
    assertThrows(InvalidCustomer.class, createCustomer(name, age));
  }

  /**
   * Test customer deletion.
   *
   * @throws InvalidCustomer the invalid customer
   */
  @Test
  @DisplayName("Test Customer Invalid ID retrieve")
  public void testCustomerDeletion() throws InvalidCustomer {
    assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(-1));
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
    Customer customer = customerService.createCustomer(name, age, GenderType.MALE);
    customer.setName("XYZASGFDGHS");
    customerService.updateCustomer(customer);
    Customer customerRetrieved = customerService.getCustomerById(customer.getId());
    assertEquals(customer.getName(), customerRetrieved.getName());
  }
}
