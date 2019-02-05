package com.epam.bank.bean;

import java.math.BigDecimal;

import com.epam.bank.exception.InvalidTransactionException;
import com.epam.bank.service.AccountNumberGenerator;
import com.epam.bank.util.AccountStatus;
import com.epam.bank.util.AccountType;

// TODO: Auto-generated Javadoc
/**
 * The Class Account.
 * 
 * @author Somesh_Thakur
 *
 */
public class Account {

	/** The customer. */
	private Customer customer;

	/** The account type. */
	private AccountType accountType;

	/** The account number. */
	private int accountNumber = -1;

	/** The balance. */
	private BigDecimal balance;

	/** The status. */
	private AccountStatus status;

	/**
	 * Instantiates a new account.
	 *
	 * @param customer    the customer
	 * @param accountType the account type
	 */
	public Account(Customer customer, AccountType accountType) {
		this.customer = customer;
		this.accountType = accountType;
		accountNumber = AccountNumberGenerator.generate();
		balance = BigDecimal.ZERO;
		setStatus(AccountStatus.ACTIVE);
	}

	/**
	 * Gets the account number.
	 *
	 * @return the account number
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Gets the balance.
	 *
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		return balance;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public AccountStatus getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	/**
	 * Credit.
	 *
	 * @param amount the amount
	 */
	public void credit(BigDecimal amount) {
		balance = balance.add(amount);
	}

	/**
	 * Debit.
	 *
	 * @param amount the amount
	 * @throws InvalidTransactionException
	 */
	public void debit(BigDecimal amount) throws InvalidTransactionException {

		if (balance.compareTo(amount) >= 0) {
			balance = balance.subtract(amount);
		} else {
			throw new InvalidTransactionException("Insufficient Balance");
		}
	}
}
