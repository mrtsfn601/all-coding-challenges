package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
https://leetcode.com/problems/two-sum/

Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 
Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/

public class TwoSum {
  
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
