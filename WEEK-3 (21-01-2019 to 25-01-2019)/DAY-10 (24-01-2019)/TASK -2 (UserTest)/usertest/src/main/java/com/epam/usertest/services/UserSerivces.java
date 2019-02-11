package com.epam.usertest.services;

import com.epam.usertest.models.User;

/**
 * The Class UserSerivces.
 *
 * @author Somesh_Thakur
 */
public class UserSerivces {

  /**
   * Activate.
   *
   * @param user the user
   */
  public void activate(User user) {
    user.setActive(true);
  }

  /**
   * Deactivate.
   *
   * @param user the user
   */
  public void deactivate(User user) {
    user.setActive(false);
  }

}
