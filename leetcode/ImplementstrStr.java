package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/

Implement strStr()

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
 
Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
*/

class ImplementstrStr {
    // index of first occurence, otherwise -1
  
    public int strStr(String haystack, String needle) {
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        
        for (int i = 0, j = 0; i <= h.length - n.length; i++) {
            if (h[i] == n[j]) {
                for (int k = i; k < h.length && j < n.length; k++, j++) {
                    if (h[k] != n[j]) {
                        break;
                    } else if (j == n.length - 1) {
                        return i;
                    }
                }
                j = 0;
            }
        }
        return -1;
    }
}
