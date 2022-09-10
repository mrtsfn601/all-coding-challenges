package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/

class ContainsDuplicate {
    
    // set.add() returns true if this set did not already contain the specified element
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int n : nums) {
            if (!unique.add(n)) {
                return true;
            }
        }
        return false;
    }
    
    // with sorting
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i-1] == nums[i]) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
