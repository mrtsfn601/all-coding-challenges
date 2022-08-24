package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/

Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/
class LongestCommonPrefix {
        
    public String longestCommonPrefix(String[] strs) {
        String lcp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            lcp = longestCommonPrefix(lcp, strs[i]);
            if (lcp.isEmpty()) {
                return "";
            }
        }
        return lcp;
    }
    
    private static String longestCommonPrefix(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        int len = Math.min(a1.length, a2.length);
        for (int i = 0; i < len; i++) {
            if (a1[i] != a2[i]) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, len);
    }
  
    // public String longestCommonPrefix(String[] strs) {
    //     if (strs.length == 0) return "";
    //     String prefix = strs[0];
    //     for (int i = 1; i < strs.length; i++)
    //         while (strs[i].indexOf(prefix) != 0) {
    //             prefix = prefix.substring(0, prefix.length() - 1);
    //             if (prefix.isEmpty()) return "";
    //         }        
    //     return prefix;
    // }
}
