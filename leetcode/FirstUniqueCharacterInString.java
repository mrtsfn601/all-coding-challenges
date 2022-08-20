package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/

First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:

Input: s = "leetcode"
Output: 0

Example 2:

Input: s = "loveleetcode"
Output: 2

Example 3:

Input: s = "aabb"
Output: -1
 
Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
*/

class FirstUniqueCharacterInString {
    
    // faster solution
    public int firstUniqChar(String s) {
        Integer[] indexes = new Integer[26];
        char[] text = s.toCharArray();
        int len = text.length;
        
        for (int i = 0; i < len; i++) {
            int j = text[i] - 'a';
            if (indexes[j] == null) {
                indexes[j] = i;
            } else {
                indexes[j] = len;
            }
        }
        int firstUniqCharIndex = len;
        for (Integer i : indexes) {
            if (i != null && i < firstUniqCharIndex) {
                firstUniqCharIndex = i;
            }
        }
        if (firstUniqCharIndex == len) {
            return -1;
        }
        return firstUniqCharIndex;
    }

    // slower solution
//     public int firstUniqChar(String s) {
//         Map<Character, Integer> indexes = new HashMap<>();
//         char[] text = s.toCharArray();
//         int len = text.length;
        
//         for (int i = 0; i < len; i++) {
//             char c = text[i];
//             if (!indexes.containsKey(c)) {
//                 indexes.put(c, i);
//             } else {
//                 indexes.put(c, len);
//             }
//         }
//         int firstUniqCharIndex = len;
//         for (Integer i : indexes.values()) {
//             if (i < firstUniqCharIndex) {
//                 firstUniqCharIndex = i;
//             }
//         }
//         if (firstUniqCharIndex == len) {
//             return -1;
//         }
//         return firstUniqCharIndex;
//     }
    
}
