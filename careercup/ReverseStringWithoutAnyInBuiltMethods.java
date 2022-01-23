package careercup;

import java.util.Arrays;

/**
 * Write program for the following case:
 * Reverse string (string is stored in an array).
 * Input:  [T, h, i, s,  , i, s,  , a, n,  , e, x, a, m, p, l, e]
 * Output: [s, i, h, T,  , s, i,  , n, a,  , e, l, p, m, a, x, e]
 * Write program without using any in-built functions.
 * Source: https://www.careercup.com/question?id=5694329337151488
 */
// Questions:
// string is stored in an array - array of chars, array of Strings (words)?
// what if empty array?
// split words by whitespaces?
// what if multiple whitespaces between words?
public class ReverseStringWithoutAnyInBuiltMethods {
    public static void main(String[] args) {
        System.out.println(Arrays.toString("This is an example".toCharArray()));
        System.out.println(Arrays.toString(reverseCharArrayInPlace("This is an example".toCharArray())));
    }

    private static char[] reverseCharArrayInPlace(char[] arr) {
        if(arr.length < 2) {
            return arr;
        }

        for (int start = 0, end = 1; end < arr.length; end++) {
            if (arr[end] == ' ') {
                reverseSubArray(arr, start, end - 1);
                start = end + 1;
            } else if (end == arr.length - 1) {
                reverseSubArray(arr, start, end);
            }
        }
        return  arr;
    }

    private static void reverseSubArray(char[] arr, int a, int b) {
        while(a < b) {
            swap(arr, a, b);
            a++;
            b--;
        }
    }

    private static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
