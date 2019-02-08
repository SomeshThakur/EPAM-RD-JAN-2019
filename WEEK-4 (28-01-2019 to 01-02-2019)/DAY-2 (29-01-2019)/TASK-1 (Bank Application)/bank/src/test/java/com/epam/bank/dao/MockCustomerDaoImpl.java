package com.epam.bank.dao;

import com.epam.bank.bean.Customer;
import com.epam.bank.exception.CustomerNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MockCustomerDaoImpl implements CustomerDao {
  List<Customer> customerDb;
  Supplier<CustomerNotFoundException> supplier = () -> {
    return new CustomerNotFoundException("ID Doesnot Exits");
  };

  public MockCustomerDaoImpl() {
    customerDb = new ArrayList<Customer>();
  }

  @Override
  public Customer getCustomerById(int id) throws CustomerNotFoundException {
    return customerDb.stream().filter(findCustomer(id)).findAny().orElseThrow(supplier);
  }

  private Predicate<? super Customer> findCustomer(int id) {
    return customer -> customer.getId() == id;
  }

  @Override
  public boolean updateCustomer(Customer customer) throws CustomerNotFoundException {
    Customer oldCustomer = getCustomerById(customer.getId());
    customerDb.remove(oldCustomer);
    Customer updatedCustomer = new Customer(customer);
    return customerDb.add(updatedCustomer);
  }

  @Override
  public boolean save(Customer customer) {
    return customerDb.add(customer);
  }

}
