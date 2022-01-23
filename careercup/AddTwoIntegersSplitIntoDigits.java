package careercup;

import java.util.ArrayList;
import java.util.List;

/**
 * There are 2 arrays of integers.
 * You have to add those integers and keep it in 3rd array.
 * There is one condition, if the sum is a 2 digit number, split that number into single digits
 * and other condition is, if any of the array integer is left then print that number.
 * I/P:
 * int[] a = {1,2,3,4,5,6}
 * int[] b = {2,3,4,5,6,7,8}
 * o/p:
 * {3,5,7,9,1,1,1,3,8}
 * Source: https://www.careercup.com/question?id=5692987154628608
 */
public class AddTwoIntegersSplitIntoDigits {

    public static void main(String[] args) {
        System.out.println(addArrays(new int[]{1,2,3,4,5,6}, new int[]{2,3,4,5,6,7,8}));
        System.out.println(addArrays(new int[]{}, new int[]{}));
    }

    // what-if questions:
    // negative integer(s) or/and sum?
    // 2 and more digit integers? and 3 and more digit sum?
    private static List<Integer> addArrays (int[] a, int[] b) {
        List<Integer> res = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < a.length || i < b.length; i++) {
            if(i >= a.length) {
                sum = b[i];
            } else if (i >= b.length) {
                sum = a[i];
            } else {
                sum = a[i] + b[i];
            }

            if(sum < 10) {
                res.add(sum);
            } else {
                res.add(sum/10);
                res.add(sum%10);
            }
        }
        return res;
    }
}
