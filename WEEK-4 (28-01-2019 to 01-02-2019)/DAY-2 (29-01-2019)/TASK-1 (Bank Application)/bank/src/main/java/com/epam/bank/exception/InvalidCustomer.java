package com.epam.bank.exception;

/**
 * The Class InvalidCustomer.
 *
 * @author Somesh_Thakur
 */
public class InvalidCustomer extends Exception {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -437765895320331833L;

  /**
   * Instantiates a new invalid customer.
   *
   * @param msg the msg
   */
  public InvalidCustomer(String msg) {
    super(msg);
  }
}
