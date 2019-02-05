package com.epam.lambda_example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Supplier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.lambda_examlpes.OTP;

/**
 * The Class TestSupplierExample.
 *
 * @author Somesh_Thakur
 */
class TestSupplierExample {

	/**
	 * Test supplier OTP.
	 */
	@Test
	@DisplayName("Test Supplier with OTP")
	public void testSupplierOTP() {
		Supplier<OTP> otpSuppiler = () -> {
			return new OTP();
		};
		List<Integer> allOtps = new ArrayList<Integer>();
		allOtps.add(otpSuppiler.get().getValue());
		allOtps.add(otpSuppiler.get().getValue());
		allOtps.add(otpSuppiler.get().getValue());

		assertEquals(new HashSet<Integer>(allOtps).size(), allOtps.size());
	}

}
