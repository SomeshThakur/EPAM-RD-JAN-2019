package com.epam.bank.model;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.IntrospectionException;

import org.junit.jupiter.api.Test;

import com.epam.bank.manager.AccountManager;

import net.codebox.javabeantester.JavaBeanTester;

class TestAccount {

	@Test
	public void testAccountCreation() throws IntrospectionException {
		JavaBeanTester.test(Account.class);
	}
}
