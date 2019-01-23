package com.epam.studentmanagement.managers;

import java.util.*;

import com.epam.studentmanagement.models.Student;

/**
 * The Class StudentManagement.
 * 
 * @author Somesh_Thakur
 */
public final class StudentManagement {

	/** The students. */
	private final List<Student> students;

	/**
	 * Instantiates a new student management.
	 *
	 * @param students the students
	 */
	public StudentManagement(final List<Student> students) {
		ArrayList<Student> tmpList = new ArrayList<>(students);
		this.students = tmpList;
	}

	/**
	 * Gets the students.
	 *
	 * @return the students
	 */
	public List<Student> getStudents() {
		ArrayList<Student> tmpList = new ArrayList<>(students);
		return tmpList;
	}
}