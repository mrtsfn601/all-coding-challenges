package careercup;

import java.util.Arrays;

/**
 * Given you an array of 100 Elements with one number missing.
 * How will you find the missing number?
 * Array 1 to 100 with 55 missing.
 */
// 1st way - do sum of all the numbers and take the difference and you will get missing number
// but the sum can overflow if integers is close to Integer.Max
// 2nd way - traverse the array and check for missing number if evenly spaced
// questions:
// How missing number is identified?
// Array is sorted OR unsorted?
// Integers are positive OR/AND negative?
// The range is stable 1 to 100? what it missing number is min or max value?
// {1,2,0,4} or {1,2,4} or {2,4,1}
public class FindMissingNumber {

    private static int min = 1;
    private static int max = 100;
    private static int missingNum = 55;
    private static final int SIZE = 100;
    private static final int SUM_EXPECTED = ((max + min) * (max - min + 1)) / 2;

    public static void main(String[] args) {
        int[] arr = new int[SIZE];
        for (int i = 0, j = min; i < 100; i++, j++) {
            if (j != missingNum) {
                arr[i] = j;
            }
        }
        System.out.println(findMissingNumber(arr));
    }

    // Find one missing number in unsorted array with numbers from 1 to 100
    private static int findMissingNumber(int[] arr) {
        int sumActual = 0;
        for (int a : arr) {
            sumActual += a;
        }
        return (SUM_EXPECTED - sumActual);
    }
}