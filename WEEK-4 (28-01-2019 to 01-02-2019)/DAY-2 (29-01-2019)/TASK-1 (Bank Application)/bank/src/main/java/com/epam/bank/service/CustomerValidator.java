package com.epam.bank.service;

import com.epam.bank.bean.Customer;
import com.epam.bank.constants.CustomerContants;

/**
 * The Class CustomerValidator.
 *
 * @author Somesh_Thakur
 */
public class CustomerValidator {

  /**
   * Instantiates a new customer validator.
   */
  private CustomerValidator() {

  }

  /**
   * Verify.
   *
   * @param customer the customer
   * @return true, if successful
   */
  public static boolean verify(Customer customer) {
    return verifyName(customer.getName()) && verifyAge(customer.getAge());
  }

  /**
   * Verify age.
   *
   * @param age the age
   * @return true, if successful
   */
  private static boolean verifyAge(int age) {
    return age < CustomerContants.MAX_AGE && age >= CustomerContants.MIN_AGE;
  }

  /**
   * Verify name.
   *
   * @param name the name
   * @return true, if successful
   */
  private static boolean verifyName(String name) {
    return (minLen(name) && maxLen(name));
  }

  /**
   * Max len.
   *
   * @param name the name
   * @return true, if successful
   */
  private static boolean maxLen(String name) {
    return name.length() < CustomerContants.MAX_NAME_LENGTH;
  }

  /**
   * Min len.
   *
   * @param name the name
   * @return true, if successful
   */
  private static boolean minLen(String name) {
    return name.length() > CustomerContants.MIN_NAME_LENGTH;
  }

}
