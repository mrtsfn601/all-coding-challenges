package leetcode;

/*
Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]
 
Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 
Follow up: Could you minimize the total number of operations done?
*/

class Solution {
    
    // brute force
    // public void moveZeroes(int[] nums) {
    //     int i = 0;
    //     int j = 0;
    //     int len = nums.length;
    //     while (i < len && j < len) {
    //         while (i < len && nums[i] != 0) {
    //             i++;
    //         }
    //         j = i+1;
    //         while (j < len && nums[j] == 0) {
    //             j++;
    //         }
    //         if (i < len && j < len && nums[i] == 0 && nums[j] != 0) {
    //             int buff = nums[i];
    //             nums[i] = nums[j];
    //             nums[j] = buff;
    //         }
    //         i++;
    //     } 
    // }
    
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int buff = nums[i];
                nums[i] = nums[j];
                nums[j] = buff;
                i++;
            }
        }
    }
    
    // splitted previous solution
    // public void moveZeroes(int[] nums) {
    //     int lastNonZeroFoundAt = 0;
    //     // If the current element is not 0, then we need to
    //     // append it just in front of last non 0 element we found. 
    //     for (int n : nums) {
    //         if (n != 0) {
    //             nums[lastNonZeroFoundAt++] = n;
    //         }
    //     }
    //     // After we have finished processing new elements,
    //     // all the non-zero elements are already at beginning of array.
    //     // We just need to fill remaining array with 0's.
    //     for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
    //         nums[i] = 0;
    //     }
    // }
}
