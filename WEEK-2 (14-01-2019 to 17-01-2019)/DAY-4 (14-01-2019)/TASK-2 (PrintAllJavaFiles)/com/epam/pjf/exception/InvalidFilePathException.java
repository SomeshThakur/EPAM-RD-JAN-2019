package com.epam.pjf.exception;
/**
 * The Class InvalidFilePathException.
 *
 * @author Somesh_Thakur
 */
public class InvalidFilePathException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4340710624334590113L;

	/**
	 * Instantiates a new invalid file path exception.
	 *
	 * @param msg the msg
	 */
	public InvalidFilePathException(String msg) {
		super(msg);
	}
}
