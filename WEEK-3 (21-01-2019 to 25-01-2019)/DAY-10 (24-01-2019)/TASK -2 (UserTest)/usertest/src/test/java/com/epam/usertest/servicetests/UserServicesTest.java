/**
 *  UserService Test Cases.
 */

package com.epam.usertest.servicetests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.epam.usertest.models.User;
import com.epam.usertest.services.UserSerivces;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/**
 * The Class UserServicesTestCases.
 *
 * @author Somesh_Thakur
 */
public class UserServicesTest {

  /** The user services. */
  private static UserSerivces userServices;

  /** The user. */
  private User user;

  /**
   * Inits the test.
   */
  @BeforeAll
  public static void init() {
    userServices = new UserSerivces();
  }

  /**
   * Inits the user.
   */
  @BeforeEach
  public void initUser() {
    user = new User("John", "Keny");
  }

  /**
   * Test user activation.
   */

  @RepeatedTest(10)
  public void testUserActivation() {
    userServices.activate(user);
    assertTrue(user.isActive());
  }

  /**
   * Test user deactivation.
   */
  @Test
  public void testUserDeactivation() {
    userServices.deactivate(user);
    assertFalse(user.isActive());
  }
}
