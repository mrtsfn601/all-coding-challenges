package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/

String to Integer (atoi)

Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 
Example 1:

Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-231, 231 - 1], the final result is 42.

Example 2:

Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42.

Example 3:

Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
 
Constraints:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
*/

class StringToIntegerAtoi {
    
    public int myAtoi(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        final char[] a = s.toCharArray();
        final int len = a.length;
        long res = 0;
        int i = 0;
        boolean isNegative = false;

        // skip leading whitespaces
        while (i < len && a[i] == ' ') {
            i++;
        }
        
        // check if the number is negative or positive
        if (i < len) {
            if (a[i] == '-') {
                isNegative = true;
                i++;
            } else if (a[i] == '+') {
                i++;
            }
        }

        // skip zeros
        while (i < len && a[i] == '0') {
            i++;
        }
        
        // convert to digits till end or non-digit or integer over/underflow
        final int maxI = i + String.valueOf(Integer.MAX_VALUE).length() - 1;
        while (i < len) {
            if (!isDigit(a[i])) {
                break;
            }
            res = (res * 10) + (a[i] - '0');
            if (i == maxI) {
                if (isNegative
                    && (-res <= Integer.MIN_VALUE
                    || i + 1 < len && Character.isDigit(a[i+1]))) {
                    return Integer.MIN_VALUE;
                } else if (!isNegative
                    && (Integer.MAX_VALUE <= res
                    || i + 1 < len && Character.isDigit(a[i+1]))) {
                    return Integer.MAX_VALUE;
                }
            }
            i++;
        }
        if (isNegative) {
            res = -res;
        }
        return (int) res;
    }
    
    private boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }
}
