package com.epam.studentperformance.service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The Class MarksValidator.
 */
public class MarksValidator {

  /**
   * Good Marks should be greater than 40.
   *
   * @param actualMarks the actual marks
   * @return the boolean
   */
  public boolean checkGoodMarks(List<Integer> actualMarks) {
    List<Integer> filteredList = actualMarks.stream()
        .filter(num -> num < 40).collect(Collectors.toList());
    return filteredList.isEmpty();
  }

}
