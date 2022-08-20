package leetcode:

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/

Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.equals(t)) {
            return true;
        }
        Map<Character, Integer> sCount = count(s);
        Map<Character, Integer> tCount = count(t);
        if (sCount.size() != tCount.size()) {
            return false;
        }
        for (Character c : sCount.keySet()) {
            if (!tCount.containsKey(c) || !sCount.get(c).equals(tCount.get(c))) {
                return false;
            }
        }
        return true;
    }
    
    private static Map<Character, Integer> count(String s) {
        Map<Character, Integer> count = new HashMap<>(); 
        for (char c : s.toCharArray()) {
            if (!count.containsKey(c)) {
                count.put(c, 1);
            } else {
                count.put(c, count.get(c) + 1);
            }
        }
        return count;
    }
}
