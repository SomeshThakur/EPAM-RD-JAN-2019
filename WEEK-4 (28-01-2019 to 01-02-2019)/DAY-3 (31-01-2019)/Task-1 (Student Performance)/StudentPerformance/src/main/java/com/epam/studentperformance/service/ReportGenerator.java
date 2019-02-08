package com.epam.studentperformance.service;

import com.epam.studentperformance.Student;
import com.epam.studentperformance.util.Remark;

import java.util.Arrays;
import java.util.List;

/**
 * The Class ReportGenerator.
 */
public class ReportGenerator {

  /** The Constant MIN_AVERAGE. */
  private static final int MIN_AVERAGE = 60;

  /**
   * Generate report.
   *
   * @param student the student
   * @return the remark
   */
  public Remark generateReport(Student student) {
    MarksValidator validator = new MarksValidator();
    boolean marksAreGood = validator.checkGoodMarks(student.getStudentMarks());
    int averageMarks = calculateAvg(student.getStudentMarks(), student.getTotalMarks());
    if (marksAreGood && averageMarks >= MIN_AVERAGE) {
      return Remark.GOOD;
    }
    return Remark.BAD;
  }

  /**
   * Calculate avg.
   *
   * @param marks      the marks
   * @param totalMarks the total marks
   * @return the int
   */
  private int calculateAvg(List<Integer> marks, int totalMarks) {
    return totalMarks / marks.size();
  }

  /**
   * Calculate total marks.
   *
   * @param marks the marks
   * @return the int
   */
  public int calculateTotalMarks(int[] marks) {
    return Arrays.stream(marks).sum();
  }
}
