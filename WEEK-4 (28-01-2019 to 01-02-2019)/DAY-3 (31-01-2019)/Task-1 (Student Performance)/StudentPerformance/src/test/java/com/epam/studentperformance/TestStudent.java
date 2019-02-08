package com.epam.studentperformance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.studentperformance.service.ReportGenerator;
import com.epam.studentperformance.util.Remark;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The Class TestStudent.
 * 
 * @author Somesh_Thakur
 *
 */
public class TestStudent {

  /** The student. */
  private Student student;

  /** The report generator. */
  private ReportGenerator reportGenerator;

  /**
   * Initilization work.
   */
  @DisplayName("Initialize Objects")
  @BeforeEach
  public void init() {
    reportGenerator = new ReportGenerator();
    student = new Student();
    int[] marks = { 70, 70, 70, 70, 80 };
    student.setStudentName("Nishant");
    List<Integer> marksList = Arrays.stream(marks).boxed().collect(Collectors.toList());
    student.setStudentMarks(marksList);
    int totalMarks = reportGenerator.calculateTotalMarks(marks);
    student.setTotalMarks(totalMarks);
  }

  /**
   * Test student name.
   */
  @DisplayName("Test name of Student")
  @Test
  public void testStudentName() {
    Student testStudent = new Student();
    testStudent.setStudentName("Somesh");
    String expectedStudentName = "Somesh";
    assertEquals(expectedStudentName, testStudent.getStudentName());
  }

  /**
   * Test total marks.
   */
  @DisplayName("Test total marks")
  @Test
  public void testTotalMarks() {
    Student testStudent = new Student();
    testStudent.setTotalMarks(360);
    assertEquals(student.getTotalMarks(), testStudent.getTotalMarks());
  }

  /**
   * Test get student marks.
   */
  @DisplayName("Test each subject marks of student")
  @Test
  public void testGetStudentMarks() {
    int[] marks = { 70, 70, 70, 70, 80 };
    List<Integer> marksList = Arrays.stream(marks).boxed().collect(Collectors.toList());
    assertEquals(marksList, student.getStudentMarks());
  }

  /**
   * Test good student.
   */
  @DisplayName("Test Good Student")
  @Test
  public void testGoodStudent() {
    Remark remark = reportGenerator.generateReport(student);
    assertEquals(Remark.GOOD, remark);
  }

  /**
   * Test bad student.
   */
  @DisplayName("Test Bad Student")
  @Test
  public void testBadStudent() {
    int[] marks = { 39, 70, 60, 70, 80 };
    List<Integer> marksList = Arrays.stream(marks).boxed().collect(Collectors.toList());

    Student student = new Student();
    student.setStudentMarks(marksList);
    student.setTotalMarks(reportGenerator.calculateTotalMarks(marks));
    Remark remark = reportGenerator.generateReport(student);
    assertEquals(Remark.BAD, remark);
  }

}
