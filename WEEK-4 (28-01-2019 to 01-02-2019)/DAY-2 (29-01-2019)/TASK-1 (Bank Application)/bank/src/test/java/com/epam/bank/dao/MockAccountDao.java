package com.epam.bank.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.epam.bank.bean.Account;
import com.epam.bank.bean.Customer;
import com.epam.bank.exception.AccountNotFoundException;
import com.epam.bank.util.AccountStatus;
import com.epam.bank.util.GenderType;

/**
 * The Class MockAccountDao.
 */
public class MockAccountDao implements AccountDao {

	/** The accounts. */
	private List<Account> accounts;
	Supplier<AccountNotFoundException> supplier = () -> {
		return new AccountNotFoundException("ID Doesnot Exits");
	};

	/**
	 * Instantiates a new mock account dao.
	 */
	public MockAccountDao() {
		accounts = new ArrayList<Account>();
	}

	/*
	 * Create Account
	 * 
	 * @see com.epam.bank.dao.AccountDao#createAccount()
	 */
	@Override
	public Account createAccount(Customer customer, AccountType accountType) {
		Account account = new Account(customer, accountType);
		accounts.add(account);
		return account;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.bank.dao.AccountDao#deleteAccount(com.epam.bank.bean.Account)
	 */
	@Override
	public boolean deleteAccount(Account account) {
		account.setStatus(AccountStatus.INACTIVE);
		return accounts.remove(account);
	}

	/*
	 * Mock Implementaion of getAccountById
	 * 
	 * @see com.epam.bank.dao.AccountDao#getAccountById(int)
	 */
	@Override
	public Account getAccountById(int id) throws AccountNotFoundException {

		return accounts.stream().filter(findAccount(id)).findAny().orElseThrow(supplier);
	}

	/**
	 * Find account.
	 *
	 * @param id the id
	 * @return the predicate
	 */
	private Predicate<Account> findAccount(int id) {
		return acc -> acc.getAccountNumber() == id && acc.getStatus() == AccountStatus.ACTIVE;
	}
}
