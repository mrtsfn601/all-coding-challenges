package misc;

import java.util.Collections;
import java.util.List;

/**
 * Given two non-empty arrays of integers, write a function that determines whether the second array
 * is a subsequence of the first one. A subsequence of an array is a set of numbers that aren't
 * necessarily adjacent in the array, but that are in the same order as they appear in the array.
 * ex: the numbers [1,3,4] form a subsequence of the array [1,2,3,4], and so do the numbers [2,4].
 * Note: a single number in an array, and the array itself are both valid subsequence of the array.
 */
public class ValidateSubsequence {

  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

    if (sequence.size() > array.size()) {
      return false;
    }

    int count = 0;
    int j = 0;

    for (Integer s : sequence) {
      while (j < array.size()) {

        // if numbers match continue with next sequence number
        if (s.equals(array.get(j))) {
          count++;
          break;
        }

        // otherwise continue looking for match
        j++;
      }
    }

    // return true if actual matches equal to expected ones
    return count == sequence.size();
  }
}
