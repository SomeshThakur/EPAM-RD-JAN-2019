package com.epam.usertest.validators;

import com.epam.usertest.constants.UserNameContants;
import com.epam.usertest.models.User;

/**
 * The Class UserValidator.
 */
public class UserValidator {

	/**
	 * Validate name.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	public boolean validateName(User user) {
		return validateFirstName(user) && validateSecondName(user);
	}

	/**
	 * Validate first name.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	private boolean validateFirstName(User user) {
		String firstName = user.getFristname();
		return firstName.length() >= UserNameContants.MIN_FIRST_NAME_LENGTH
				&& firstName.length() <= UserNameContants.MAX_FIRST_NAME_LENGTH;
	}

	/**
	 * Validate second name.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	private boolean validateSecondName(User user) {
		String lastName = user.getLastname();
		return lastName.length() >= UserNameContants.MIN_LAST_NAME_LENGTH
				&& lastName.length() <= UserNameContants.MAX_LAST_NAME_LENGTH;
	}

}
