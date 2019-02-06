/**
 * 
 */
package com.epam.bank.exception;

/**
 * @author Somesh_Thakur
 *
 */
public class InvalidCustomer extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -437765895320331833L;

	public InvalidCustomer(String msg) {
		super(msg);
	}
}
