package com.epam.studentmanagement.models;

/**
 * The Class Student.
 * 
 * @author Somesh_Thakur
 *
 */
public class Student {

	/** The name. */
	private final String name;

	/** The age. */
	private final int age;

	/**
	 * Instantiates a new student.
	 *
	 * @param name the name
	 * @param age  the age
	 */
	public Student(final String name, final int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
}