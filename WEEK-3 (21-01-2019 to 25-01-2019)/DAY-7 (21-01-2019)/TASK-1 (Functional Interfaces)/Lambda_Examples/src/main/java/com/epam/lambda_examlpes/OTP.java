package com.epam.lambda_examlpes;

import java.util.Random;

/**
 * The Class OTP for Supplier Example.
 */
public class OTP {
	private int value;
	private final Random random = new Random();

	/**
	 * Instantiates a new otp.
	 */
	public OTP() {
		value = random.nextInt(1000);
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
