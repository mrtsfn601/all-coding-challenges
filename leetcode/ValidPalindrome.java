package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/

Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 
Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] text = s.toLowerCase().toCharArray();
        
        for (int i = 0, j = text.length - 1; i < j; i++, j--) {
            while (i < j && !isAlphaNumeric(text[i])) {
                i++;
            }
            while (i < j && !isAlphaNumeric(text[j])) {
                j--;
            }
            if (text[i] != text[j]) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean isAlphaNumeric(char c) {
        return ('0' <= c && c <= '9')
            || ('a' <= c && c <= 'z')
            || ('A' <= c && c <= 'Z');
    }
}
