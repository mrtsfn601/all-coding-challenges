package amazon;

/**
 * Find the missing number in the array
 * You are given an array of positive numbers from 1 to n,
 * such that all numbers from 1 to n are present except one number x.
 * You have to find x. The input array is not sorted.
 * Look at the below array and give it a try before checking the solution.
 * Source: https://www.educative.io/blog/crack-amazon-coding-interview-questions
 * I/p: [3, 7, 1, 2, 8, 4, 5] n = 8
 * O/p: 6 (missing number)
 */
public class FindMissingNumberInArray {

    public static void main(String[] args) {
        System.out.println(findMissingNumberInArray(new int[]{3, 7, 1, 2, 8, 4, 5}, 8)); // missing 6
        System.out.println(findMissingNumberInArray(new int[]{3, 7, 2, 8, 4, 5, 6}, 8)); // missing 1
        System.out.println(findMissingNumberInArray(new int[]{1}, 2));  // missing 2
        System.out.println(findMissingNumberInArray(new int[]{}, 1));   // missing 1
    }

    // find the expected sum of numbers from 1 to n using math formula ( n * (n + 1) ) / 2
    // find the actual sum of numbers in the array, it would take a linear O(n)
    // the missing number is a difference between expected and actual sum
    private static int findMissingNumberInArray(int[] arr, int n) {
        int expectedSum = ((n) * (n + 1)) / 2; // n = arr.length + 1
//        int expectedSum = ((arr.length + 1) * (arr.length + 2)) / 2;
        int actualSum = 0;

        for (int a : arr) {
            actualSum += a;
        }

        return expectedSum - actualSum;
    }
}
