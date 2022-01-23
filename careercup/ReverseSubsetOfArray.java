package careercup;

import java.util.Arrays;

/**
 * Reverse an array in subset of N. Example:
 * input: Array = [1,2,3,4,5,6,7,8,9], N = 3
 * output: [3,2,1,6,5,4,9,8,7]
 * Source: https://www.careercup.com/question?id=5181130190880768
 */
//
public class ReverseSubsetOfArray {

    public static void main(String[] args) {
        // by index
        System.out.println(Arrays.equals(new int[]{4, 3, 2, 1, 5, 6, 7, 8, 9},
                reverseSubarrayByIndex(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)));
        // by value
        System.out.println(Arrays.equals(new int[]{3, 2, 1, 4, 5, 6, 7, 8, 9},
                reverseSubarrayByValue(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)));
    }

    // Questions:
    // N is index, value or number of integers?
    // Including N or excluding?
    // Here, N is an index and it's including.
    private static int[] reverseSubarrayByIndex(int[] arr, int index) {
        if (isRange(arr, index)) {
            reverseSubarray(arr, 0, index);
        }
        return arr;
    }

    // Here, N is a value and it's including
    private static int[] reverseSubarrayByValue(int[] arr, int value) {
        int index = indexOf(arr, value);
        if (index != -1) {
            reverseSubarray(arr, 0, index);
        }
        return arr;
    }

    // Reusable methods:
    private static int indexOf(int[] arr, int val) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    private static void reverseSubarray(int[] arr, int from, int to) {
        while (from < to) {
            swap(arr, from, to);
            from++;
            to--;
        }
    }

    private static boolean isRange(int[] arr, int n) {
        return (n >= 0 && n < arr.length);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
