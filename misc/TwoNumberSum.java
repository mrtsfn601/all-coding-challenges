package misc;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * Write a function that takes in a non-empty list of distinct integers, and an integer representing
 * target sum. If any two numbers in the input list sum up to the target sum, the function should
 * return them in a list, in any order. If no two numbers sum up to the target sum, the function
 * should return an empty list;
 */
public class TwoNumberSum {

  public List<Integer> find(List<Integer> numbers, int targetSum) {

    Set<Integer> set = new HashSet<>(numbers);
    Integer second;

    for (Integer n : numbers) {
      second = targetSum - n;

      if (set.contains(second) && n != second) {
        return List.of(n, second);
      }
    }

    return Collections.emptyList();
  }
}
