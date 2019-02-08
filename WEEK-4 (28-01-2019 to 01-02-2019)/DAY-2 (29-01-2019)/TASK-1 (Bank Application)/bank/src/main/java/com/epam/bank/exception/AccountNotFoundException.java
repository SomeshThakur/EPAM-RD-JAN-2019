package com.epam.bank.exception;

/**
 * The Class AccountNotFoundException.
 *
 * @author Somesh_Thakur
 */
public class AccountNotFoundException extends Exception {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 4443141591681187285L;

  /**
   * Instantiates a new account not found exception.
   *
   * @param message the message
   */
  public AccountNotFoundException(String message) {
    super(message);
  }
}