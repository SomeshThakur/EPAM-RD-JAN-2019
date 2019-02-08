package com.epam.bank.bean;

import com.epam.bank.service.CustomerIdGenerator;
import com.epam.bank.util.GenderType;

/**
 * The Class Customer.
 *
 * @author Somesh_Thakur
 */
public class Customer {

  /** The name. */
  private String name;

  /** The age. */
  private int age;

  /** The gender. */
  private GenderType gender;

  /** The id. */
  private final int id;

  /**
   * Instantiates a new customer.
   */
  public Customer() {
    id = CustomerIdGenerator.generate();
  }

  /**
   * Instantiates a new customer.
   *
   * @param customer the customer
   */
  public Customer(Customer customer) {
    setName(customer.name);
    setAge(customer.age);
    setGender(customer.gender);
    this.id = customer.getId();
  }

  /**
   * Sets the gender.
   *
   * @param gender the new gender
   */
  public void setGender(GenderType gender) {
    this.gender = gender;
  }

  /**
   * Sets the age.
   *
   * @param age the new age
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the age.
   *
   * @return the age
   */
  public int getAge() {
    return age;
  }

  /**
   * Gets the gender.
   *
   * @return the gender
   */
  public GenderType getGender() {
    return gender;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(String name) {
    this.name = name;
  }
}
