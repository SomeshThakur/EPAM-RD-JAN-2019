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
	 * @param name the name
	 * @param age  the age
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

	public String getFristname() {
		return fristname;
	}

	public void setFristname(String fristname) {
		this.fristname = fristname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
