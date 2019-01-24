package com.epam.studentmanagement.models;

import java.util.ArrayList;
import java.util.List;

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

	private List<String> grades;

	/**
	 * Instantiates a new student.
	 *
	 * @param name the name
	 * @param age  the age
	 */
	public Student(final String name, final int age, List<String> grades) {
		this.name = name;
		this.age = age;
		this.grades = new ArrayList<>(grades);
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

	/**
	 * Gets the grades.
	 *
	 * @return the grades
	 */
	public List<String> getGrades() {
		return new ArrayList<>(grades);
	}
}