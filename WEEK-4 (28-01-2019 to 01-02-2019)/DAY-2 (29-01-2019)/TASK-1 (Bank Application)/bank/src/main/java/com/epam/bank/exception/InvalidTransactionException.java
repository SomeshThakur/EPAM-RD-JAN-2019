package com.epam.bank.exception;

/**
 * The Class InvalidTransactionException.
 */
public class InvalidTransactionException extends Exception {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 4989560077410934018L;

  public InvalidTransactionException(String message) {
    super(message);
  }
}
