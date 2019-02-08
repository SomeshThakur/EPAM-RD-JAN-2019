package com.epam.bank.service;

import com.epam.bank.bean.Account;
import com.epam.bank.bean.Customer;
import com.epam.bank.dao.AccountDao;
import com.epam.bank.exception.AccountNotFoundException;
import com.epam.bank.util.AccountStatus;
import com.epam.bank.util.AccountType;

/**
 * The Class AccountService.
 *
 * @author Somesh_Thakur
 */
public class AccountService {

  /** The account dao. */
  private AccountDao accountDao;

  /**
   * Sets the account dao.
   *
   * @param accountDao the new account dao
   */
  public void setAccountDao(AccountDao accountDao) {
    this.accountDao = accountDao;
  }

  /**
   * Creates the account.
   *
   * @param customer    the customer
   * @param accountType the account type
   * @return the account
   */
  public Account createAccount(Customer customer, AccountType accountType) {
    Account account = new Account(customer, accountType);
    accountDao.save(account);
    return account;
  }

  /**
   * Delete account.
   *
   * @param account the account
   * @return true, if successful
   */
  public boolean deleteAccount(Account account) {
    account.setStatus(AccountStatus.INACTIVE);
    return accountDao.deleteAccount(account);
  }

  /**
   * Gets the account by id.
   *
   * @param id the id
   * @return the account by id
   * @throws AccountNotFoundException the account not found exception
   */
  public Account getAccountById(int id) throws AccountNotFoundException {
    return accountDao.getAccountById(id);
  }

}
