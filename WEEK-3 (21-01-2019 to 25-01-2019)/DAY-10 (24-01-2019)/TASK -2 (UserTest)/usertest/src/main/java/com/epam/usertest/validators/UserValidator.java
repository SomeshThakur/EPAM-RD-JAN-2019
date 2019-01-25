package com.epam.usertest.validators;

import com.epam.usertest.constants.*;
import com.epam.usertest.models.User;

public class UserValidator {

	public boolean validateName(User user) {
		return validateFirstName(user) && validateSecondName(user);
	}

	private boolean validateFirstName(User user) {
		String firstName = user.getFristname();
		return firstName.length() >= UserNameContants.MIN_FIRST_NAME_LENGTH
				&& firstName.length() <= UserNameContants.MAX_FIRST_NAME_LENGTH;
	}

	private boolean validateSecondName(User user) {
		String lastName = user.getLastname();
		return lastName.length() >= UserNameContants.MIN_LAST_NAME_LENGTH
				&& lastName.length() <= UserNameContants.MAX_LAST_NAME_LENGTH;
	}

}
