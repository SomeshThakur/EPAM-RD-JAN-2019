package com.epam.bank.manager;

import java.util.ArrayList;
import java.util.List;

import com.epam.bank.model.Account;

public class AccountManager {
	private static List<Account> accountList = new ArrayList<Account>();;

	public final Account createAccount(String firstName, String lastName, int age, String address) {
		Account account =new Account(); 
		accountList.add(account);
		return account; 
	}

}
