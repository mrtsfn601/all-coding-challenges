package youtube;

import java.util.HashSet;
import java.util.Set;

/**
 * Google Coding Interview Question and Answer #1: First Recurring Character
 * Source: https://youtu.be/GJdiM-muYqc
 */
public class FirstRecurringCharacter {

    public static void main(String[] args) {
        System.out.println(findChar("ABCA") == 'A');
        System.out.println(findChar("BCABA") == 'B');
        System.out.println(findChar("BAAB") == 'A');
        System.out.println(findChar("ABC") == null);
        System.out.println(findChar("") == null);
        System.out.println(findChar(null) == null);
    }

    // questions:
    // numbers or spec chars in string? no, alphabetic only.
    // case-sensitive? yes, "ABa" should return null.
    // what empty or null string should return? null.

    // brute force:
    // create set to store unique letters
    // traverse string (array of chars)
    // if set doesn't contain add letter
    // if contains - return this letter
    // otherwise (if no matches) - return null

    private static Character findChar(String s) {
        if(s == null || s.isEmpty()) {
            return null;
        }
//        return findChar1(s);
        return findChar2(s);
    }

    // 1st solution
    private static Character findChar1(String s) {
        Set<String> letters = new HashSet<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            String letter = s.substring(i, i + 1);
            if (!letters.contains(letter)) {
                letters.add(letter);
            } else {
                return letter.charAt(0);
            }
        }
        return null;
    }

    // 2nd solution
    private static Character findChar2(String s) {
        Set<Character> letters = new HashSet<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char letter = s.charAt(i);
            if (!letters.contains(letter)) {
                letters.add(letter);
            } else {
                return letter;
            }
        }
        return null;
    }
}