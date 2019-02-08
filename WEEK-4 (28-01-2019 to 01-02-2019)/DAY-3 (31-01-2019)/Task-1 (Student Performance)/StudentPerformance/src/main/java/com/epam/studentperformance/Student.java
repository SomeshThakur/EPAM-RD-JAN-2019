package com.epam.studentperformance;

import java.util.List;

/**
 * The Class Student.
 *
 * @author Somesh_Thakur
 *
 */
public class Student {

  /** The student name. */
  private String studentName;

  /** The student marks. */
  private List<Integer> studentMarks;

  /** The total marks. */
  private int totalMarks;

  /**
   * Sets the student name.
   *
   * @param name the new student name
   */
  public void setStudentName(String name) {
    this.studentName = name;
  }

  /**
   * Sets the student marks.
   *
   * @param marks the new student marks
   */
  public void setStudentMarks(List<Integer> marks) {
    this.studentMarks = marks;
  }

  /**
   * Gets the student marks.
   *
   * @return the student marks
   */
  public List<Integer> getStudentMarks() {
    return studentMarks;
  }

  /**
   * Sets the total marks.
   *
   * @param totalMarks the new total marks
   */
  public void setTotalMarks(int totalMarks) {
    this.totalMarks = totalMarks;
  }

  /**
   * Gets the total marks.
   *
   * @return the total marks
   */
  public int getTotalMarks() {
    return totalMarks;
  }

  /**
   * Gets the student name.
   *
   * @return the student name
   */
  public String getStudentName() {
    return studentName;
  }
}
