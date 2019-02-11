package com.epam.usertest.models;

/**
 * The Class User.
 * 
 * @author Somesh_Thakur
 *
 */
public class User {

  /** The is active. */
  private boolean isActive;

  /** The name. */
  private String fristname;

  /** The lastname. */
  private String lastname;

  /**
   * Instantiates a new user.
   *
   * @param fristname the fristname
   * @param lastname  the lastname
   */
  public User(String fristname, String lastname) {
    this.setFristname(fristname);
    this.setLastname(lastname);
  }

  /**
   * Checks if is active.
   *
   * @return true, if is active
   */
  public boolean isActive() {
    return isActive;
  }

  /**
   * Sets the active.
   *
   * @param isActive the new active
   */
  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * Gets the fristname.
   *
   * @return the fristname
   */
  public String getFristname() {
    return fristname;
  }

  /**
   * Sets the fristname.
   *
   * @param fristname the new fristname
   */
  public void setFristname(String fristname) {
    this.fristname = fristname;
  }

  /**
   * Gets the lastname.
   *
   * @return the lastname
   */
  public String getLastname() {
    return lastname;
  }

  /**
   * Sets the lastname.
   *
   * @param lastname the new lastname
   */
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
}
