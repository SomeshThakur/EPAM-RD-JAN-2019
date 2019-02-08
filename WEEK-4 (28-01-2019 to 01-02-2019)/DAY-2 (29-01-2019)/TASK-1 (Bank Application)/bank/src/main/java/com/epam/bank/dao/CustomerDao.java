package com.epam.bank.dao;

import com.epam.bank.bean.Customer;
import com.epam.bank.exception.CustomerNotFoundException;

public interface CustomerDao {

  boolean save(Customer customer);

  Customer getCustomerById(int id) throws CustomerNotFoundException;

  boolean updateCustomer(Customer customer) throws CustomerNotFoundException;
}
