package com.epam.bank.dao;

import com.epam.bank.bean.Account;
import com.epam.bank.bean.Customer;
import com.epam.bank.exception.AccountNotFoundException;
import com.epam.bank.util.AccountType;

public interface AccountDao {

	Account createAccount(Customer customer,AccountType accountType);

	boolean deleteAccount(Account account);

	Account getAccountById(int id) throws AccountNotFoundException;

}
