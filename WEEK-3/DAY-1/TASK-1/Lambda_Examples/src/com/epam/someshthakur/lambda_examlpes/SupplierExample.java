package com.epam.someshthakur.lambda_examlpes;

import java.util.Random;
import java.util.function.Supplier;

/**
 * The Class OTP.
 */
class OTP {
    private int _value;
    private static Random random;
    static {
	random = new Random();
    }

    /**
     * Instantiates a new otp.
     */
    OTP() {
	_value = random.nextInt(1000);
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public int get_value() {
	return _value;
    }
}

/**
 * The Class SupplierExample.
 */
public class SupplierExample {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
	Supplier<OTP> supplier = () -> {
	    return new OTP();
	};
	System.out.println("OTP : " + supplier.get().get_value());
	System.out.println("OTP : " + supplier.get().get_value());
	System.out.println("OTP : " + supplier.get().get_value());
    }
}
