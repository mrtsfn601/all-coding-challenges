package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1

Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

Example 3:

Input: nums = [1]
Output: 1
 
Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/

class SingleNumber {
    
    // bit manipulation
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        return res;
    }
    
    // public int singleNumber(int[] nums) {
    //     Set<Integer> unique = new HashSet<>();
    //     for(int n : nums) {
    //         if (unique.contains(n)) {
    //             unique.remove(n);
    //         } else {
    //             unique.add(n);
    //         }
    //     }
    //     int res = -1;
    //     for (int n : unique) {
    //         return n;
    //     }
    //     return res;
    // }
}
