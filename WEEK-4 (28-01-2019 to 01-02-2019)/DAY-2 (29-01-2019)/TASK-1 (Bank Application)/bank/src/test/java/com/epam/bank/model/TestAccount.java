package com.epam.bank.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.epam.bank.bean.Account;
import com.epam.bank.bean.Customer;
import com.epam.bank.dao.AccountDao;
import com.epam.bank.dao.MockAccountDao;
import com.epam.bank.exception.AccountNotFoundException;
import com.epam.bank.exception.InvalidTransactionException;
import com.epam.bank.util.AccountType;
import com.epam.bank.util.GenderType;

/**
 * The Class TestAccount.
 * 
 * @author Somesh_Thakur
 *
 */
class TestAccount {

	/** The account dao impl. */
	private static AccountDao accountDaoImpl;

	/** The customer. */
	private static Customer customer;

	/**
	 * Inits.
	 */
	@BeforeAll
	public static void init() {
		accountDaoImpl = new MockAccountDao();
		customer = new Customer("", "", 1, GenderType.MALE, "");
		accountDaoImpl.createAccount(customer, AccountType.SAVINGS);
	}

	/**
	 * Test account creation.
	 */
	@Test
	@DisplayName("Test Account Creation")
	public void testAccountCreation() {
		Account account = accountDaoImpl.createAccount(customer, AccountType.SAVINGS);
		assertNotNull(account);
		assertNotEquals(-1, account.getAccountNumber());
	}

	/**
	 * Test account deletion.
	 */
	@Test
	@DisplayName("Test Account Deletion")
	public void testExistingAccountDeletion() {
		Account account = accountDaoImpl.createAccount(customer, AccountType.SAVINGS);
		assertTrue(accountDaoImpl.deleteAccount(account));
		assertFalse(accountDaoImpl.deleteAccount(account));
	}

	/**
	 * Test existing account credit.
	 *
	 * @throws AccountNotFoundException the account not found exception
	 */
	@Test
	@DisplayName("Test Account Credit")
	public void testExistingAccountCredit() throws AccountNotFoundException {
		Account account = accountDaoImpl.getAccountById(1);
		account.credit(new BigDecimal(100000));
		assertEquals(new BigDecimal(100000), accountDaoImpl.getAccountById(1).getBalance());
	}

	/**
	 * Test invalid account id credit.
	 */
	@Test
	@DisplayName("Test Invalid Account ID Credit")
	public void testInvalidAccountIdCredit() {
		assertThrows(AccountNotFoundException.class, () -> {
			Account account = accountDaoImpl.getAccountById(-1);
			account.credit(new BigDecimal(100000));
		});
	}

	/**
	 * Test existing account debit.
	 *
	 * @throws AccountNotFoundException    the account not found exception
	 * @throws InvalidTransactionException the invalid transaction exception
	 */
	@Test
	@DisplayName("Test Account Debit")
	public void testExistingAccountDebit() throws AccountNotFoundException, InvalidTransactionException {
		Account account = accountDaoImpl.getAccountById(2);
		account.credit(new BigDecimal(100000));
		account.debit(new BigDecimal(100000));
		assertEquals(BigDecimal.ZERO, accountDaoImpl.getAccountById(2).getBalance());
	}

	/**
	 * Test invalid account account debit.
	 */
	@Test
	@DisplayName("Test Invalid Account Debit")
	public void testInvalidAccountAccountDebit() {
		assertThrows(InvalidTransactionException.class, () -> {
			Account account = accountDaoImpl.getAccountById(1);
			account.debit(new BigDecimal(Integer.MAX_VALUE));
		});
	}
}
