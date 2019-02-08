package com.epam.bank.service;

/**
 * The Class CustomerIdGenerator.
 * 
 * @author Somesh_Thakur
 *
 */
public class CustomerIdGenerator {

  /** The count. */
  private static int count;

  /**
   * Instantiates a new customer id generator.
   */
  private CustomerIdGenerator() {

  }

  /**
   * Generate.
   *
   * @return the int
   */
  public static int generate() {
    return ++count;
  }

}
