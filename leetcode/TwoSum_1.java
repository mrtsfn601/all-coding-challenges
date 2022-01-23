package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 *
 * <p>You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * <p>You can return the answer in any order.
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum_1 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> visited = new HashMap<>();
    visited.put(nums[0], 0);
    for (int i = 1; i < nums.length; i++) {
      if (visited.containsKey(target - nums[i])) {
        return new int[] {i, visited.get(target - nums[i])};
      }
      visited.put(nums[i], i);
    }
    return new int[0];
  }
}
