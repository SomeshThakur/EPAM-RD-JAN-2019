package com.epam.optionals.exceptions;

/**
 * The Class CustomException.
 *
 * @author Somesh_Thakur
 */
public class InvalidStringException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new custom exception.
	 */
	public InvalidStringException(String msg) {
		super(msg);
	}
}
