package careercup;

import java.util.Arrays;

/**
 * Longest Consecutive Sequence
 * Given an int array which might contain duplicates, find the largest subset of it which form a sequence.
 * Eg. {1,6,10,4,7,9,5}
 * then ans is 4,5,6,7
 * Sorting is an obvious solution. Can this be done in O(n) time.
 * Source: https://www.careercup.com/question?id=11070934
 */
public class Xc1_GoogleLongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findLargestSubsequence(new int[]{1, 6, 10, 4, 7, 9, 5})));
    }

    private static int[] findLargestSubsequence(int[] a) {
        Arrays.sort(a); // 1, 4, 5, 6, 7, 9, 10
        int count = 0;
        int maxCount = 0;
        int lastInd = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] + 1 == a[i]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    lastInd = i;
                }
            } else {
                count = 0;
            }
        }
        int[] res = new int[maxCount + 1];
        for(int j = 0, i = lastInd - maxCount; i <= lastInd; j++, i++) {
            res[j] = a[i];
        }
        return res;
    }
}