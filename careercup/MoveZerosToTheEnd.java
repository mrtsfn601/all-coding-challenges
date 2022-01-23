package careercup;

import java.util.Arrays;

/**
 * Given a number in an array form.
 * Come up with an algorithm to push all the zeros to the end.
 * Expectation : O(n) solution
 * Source: https://www.careercup.com/question?id=4846025567109120
 */
public class MoveZerosToTheEnd {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosToTheEnd(new int[]{0, 1, -2, 0, 5, -10, 0, -10})));
        System.out.println(Arrays.toString(moveZerosToTheEndAndKeepTheOrder(new int[]{0, 1, -2, 0, 5, -10, 0, -10})));
    }

    // questions:
    // order is important? No {0,1,2,0,3} => {3,1,2,0,0}
    private static int[] moveZerosToTheEnd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            while(arr[left] != 0 && left < right) {
                left++;
            }
            while(arr[right] == 0 && left < right) {
                right--;
            }
            // swap
            if(left < right) {
                swap(arr, left, right);
            }
        }

        return arr;
    }

    // questions:
    // order is important? Yes {0,1,2,0,3} => {1,2,3,0,0}
    private static int[] moveZerosToTheEndAndKeepTheOrder(int[] arr) {
        if(arr.length < 2) {
            return arr;
        }

        int left = 0;
        int right = 1;

        while(right < arr.length) {
            while(right < arr.length && arr[right] == 0) {
                right++;
            }
            while(left < right && arr[left] != 0) {
                left++;
            }

            // swap
            if(arr[left] == 0 && arr[right] != 0) {
                swap(arr, left, right);
                left++;
                right++;
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
