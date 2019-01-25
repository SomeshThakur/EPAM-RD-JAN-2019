/**
 * UserValidator Test Cases.
 */
package com.epam.usertest.validatortests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.epam.usertest.models.User;
import com.epam.usertest.validators.UserValidator;

// TODO: Auto-generated Javadoc
/**
 * The Class UserValidatorTest.
 *
 * @author Somesh_Thakur
 */
class UserValidatorTest {

	/** The user validator. */
	private static UserValidator userValidator;

	/** The user. */
	private User user;

	/**
	 * Inits the.
	 */
	@BeforeAll
	public static void init() {
		userValidator = new UserValidator();
	}

	/**
	 * Test valid user.
	 */
	@Test
	public void testValidUser() {
		user = new User("John", "Keny");
		assertTrue(userValidator.validateName(user));
	}

	/**
	 * Test in valid user.
	 */
	@Test
	public void testInValidUserFirstName() {
		user = new User("A", "Keny");
		assertFalse(userValidator.validateName(user));
	}

	/**
	 * Test in valid user last name.
	 */
	@Test
	public void testInValidUserLastName() {
		user = new User("John", "K");
		assertFalse(userValidator.validateName(user));
	}
}
