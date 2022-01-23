package amazon;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if the sum of two integers is equal to the given value
 * Given an array of integers and a value,
 * determine if there are any two integers in the array whose sum is equal to the given value.
 * Return true if the sum exists and return false if it does not.
 * Source: https://www.educative.io/blog/crack-amazon-coding-interview-questions
 * I/p: [5, 7, 1, 2, 8, 4, 3], targetSum = 10 => O/p: TRUE (7 + 3 = 10, 2 + 8 = 10)
 * I/p: [5, 7, 1, 2, 8, 4, 3], targetSum = 19 => O/p: FALSE (No 2 values sum up to 19)
 */
public class FindTwoNumbersThatSumUpToTargetSum {

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{5, 7, 1, 2, 8, 4, 3}, 10)); // true
        System.out.println(findNumbers(new int[]{5, 7, 1, 2, 8, 4, 3}, 19)); // false
    }

    // sum = a + b OR sum - a = b
    // subtract 1st number of array (a) from target sum (sum - a = b)
    // store all results (b) into a set
    // if the next number of the array is present in the set return true
    // if not continue previous steps
    private static boolean findNumbers(int[] nums, int targetSum) {
        Set<Integer> setOfSecondNumbers = new HashSet<>();
        for(int num : nums) {
            if(setOfSecondNumbers.contains(num)) {
                return true;
            }
            setOfSecondNumbers.add(targetSum - num);
        }
        return false;
    }
}
