package com.epam.bank.dao;

import com.epam.bank.bean.Account;
import com.epam.bank.exception.AccountNotFoundException;

public interface AccountDao {

  boolean save(Account account);

  boolean deleteAccount(Account account);

  Account getAccountById(int id) throws AccountNotFoundException;

}
