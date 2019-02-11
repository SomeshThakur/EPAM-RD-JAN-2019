package com.epam.bank.service;

import com.epam.bank.bean.Customer;
import com.epam.bank.dao.CustomerDao;
import com.epam.bank.exception.CustomerNotFoundException;
import com.epam.bank.exception.InvalidCustomer;
import com.epam.bank.util.GenderType;

/**
 * The Class CustomerService.
 *
 * @author Somesh_Thakur
 */
public class CustomerService {
  /** The customer dao. */
  private CustomerDao customerDao;

  /**
   * Sets the customer dao.
   *
   * @param customerDao the new customer dao
   */
  public void setCustomerDao(CustomerDao customerDao) {
    this.customerDao = customerDao;
  }

  /**
   * Creates the customer.
   *
   * @param name   the name
   * @param age    the age
   * @param gender the gender
   * @return the customer
   * @throws InvalidCustomer the invalid customer
   */
  public Customer createCustomer(String name, int age, GenderType gender) throws InvalidCustomer {
    Customer customer = new Customer();
    customer.setName(name);
    customer.setAge(age);
    customer.setGender(gender);
    if (!CustomerValidator.verify(customer)) {

      throw new InvalidCustomer("Invalid Details");
    }
    customerDao.save(customer);
    return new Customer(customer);
  }

  /**
   * Gets the customer by id.
   *
   * @param id the id
   * @return the customer by id
   * @throws CustomerNotFoundException the customer not found exception
   */
  public Customer getCustomerById(int id) throws CustomerNotFoundException {
    return customerDao.getCustomerById(id);
  }

  /**
   * Update customer.
   *
   * @param customer the customer
   * @throws CustomerNotFoundException the customer not found exception
   */
  public void updateCustomer(Customer customer) throws CustomerNotFoundException {
    customerDao.updateCustomer(customer);
  }

}
