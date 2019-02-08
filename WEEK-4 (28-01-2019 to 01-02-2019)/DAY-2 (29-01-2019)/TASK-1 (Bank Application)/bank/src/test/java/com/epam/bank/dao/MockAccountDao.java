package com.epam.bank.dao;

import com.epam.bank.bean.Account;
import com.epam.bank.exception.AccountNotFoundException;
import com.epam.bank.util.AccountStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * The Class MockAccountDao.
 */
public class MockAccountDao implements AccountDao {

  /** The accounts. */
  private List<Account> accountsDb;

  /** The supplier. */
  Supplier<AccountNotFoundException> supplier = () -> {
    return new AccountNotFoundException("ID Doesnot Exits");
  };

  /**
   * Instantiates a new mock account dao.
   */
  public MockAccountDao() {
    accountsDb = new ArrayList<Account>();
  }

  /*
   * Delete Account
   * 
   * @see com.epam.bank.dao.AccountDao#deleteAccount(com.epam.bank.bean.Account)
   */
  @Override
  public boolean deleteAccount(Account account) {
    return accountsDb.remove(account);
  }

  /*
   * Mock Implementaion of getAccountById
   * 
   * @see com.epam.bank.dao.AccountDao#getAccountById(int)
   */
  @Override
  public Account getAccountById(int id) throws AccountNotFoundException {
    return accountsDb.stream().filter(findAccount(id)).findAny().orElseThrow(supplier);
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

  /*
   * Save the Account
   * 
   * @see com.epam.bank.dao.AccountDao#save(com.epam.bank.bean.Account)
   */
  @Override
  public boolean save(Account account) {
    return accountsDb.add(account);
  }
}
