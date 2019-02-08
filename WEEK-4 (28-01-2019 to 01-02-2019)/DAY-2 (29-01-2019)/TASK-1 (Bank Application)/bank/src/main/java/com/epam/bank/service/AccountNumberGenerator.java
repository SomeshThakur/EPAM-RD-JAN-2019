package com.epam.bank.service;

public class AccountNumberGenerator {
  private static int accountNum;

  private AccountNumberGenerator() {

  }

  public static int generate() {
    return ++accountNum;
  }
}
