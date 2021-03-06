package com.epam.studentmanagement.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.epam.studentmanagement.managers.StudentManagement;
import com.epam.studentmanagement.models.Student;

/**
 * The Class StudentMain.
 * 
 * @author Somesh_Thakur
 */
public class StudentMain {

	/**
	 * Initialize students.
	 *
	 * @return the list
	 */
	protected final static List<Student> initializeStudents() {
		List<Student> students = new ArrayList<>();
		String arr[] = { "A", "A", "A", "A" };
		List<String> grades = Arrays.asList(arr);
		Student student1 = new Student("Emily", 23, grades);
		Student student2 = new Student("Brock", 25, grades);
		Student student3 = new Student("Jack", 21, grades);
		Student student4 = new Student("Rock", 22, grades);
		Student student5 = new Student("Jeny", 25, grades);
		Student student6 = new Student("David", 26, grades);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		return students;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		StudentManagement sm = new StudentManagement(initializeStudents());
		List<Student> students = sm.getStudents();
		for (Student student : students) {
			System.out.println("Name: " + student.getName() + " Age: " + student.getAge());
		}
	}
}
