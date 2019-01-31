package com.epam.bank.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.bank.manager.AccountManager;

class TestAccount {
	@Test
	public void testAccountCreation() {
		AccountManager accountManager = new AccountManager();
		Account account = accountManager.createAccount("Ajay", "Singani", 21, "HOME ADDR");
		assertEquals(account.getFirstName(), "Ajay");
		assertEquals(account.getLastName(), "Singani");
		assertEquals(account.getAge(), 21);
		assertEquals(account.getAddress(), "HOME ADDR");
		assertEquals(account.getBalance(), 0d);
	}

}
