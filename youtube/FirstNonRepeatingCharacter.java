package youtube;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string s consisting of small English letters,
 * find and return the first instance of a non-repeating character in it.
 * If there is no such character, return '_' underscore.
 * At least one letter, letters only, all lowercase, no empty strings.
 * "abacabad" => 'c'
 * "abacbd" => 'c'
 * "abba" => '_'
 * Source: https://youtu.be/5co5Gvp_-S0
 */
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println('c' == findFirstNonRepeatingChar1("abacabad"));
        System.out.println('c' == findFirstNonRepeatingChar1("abacbd"));
        System.out.println('_' == findFirstNonRepeatingChar1("abba"));
        System.out.println('a' == findFirstNonRepeatingChar1("a"));
        System.out.println();
        System.out.println('c' == findFirstNonRepeatingChar2("abacabad"));
        System.out.println('c' == findFirstNonRepeatingChar2("abacbd"));
        System.out.println('_' == findFirstNonRepeatingChar2("abba"));
        System.out.println('a' == findFirstNonRepeatingChar2("a"));
        System.out.println();
        System.out.println('c' == findFirstNonRepeatingChar3("abacabad"));
        System.out.println('c' == findFirstNonRepeatingChar3("abacbd"));
        System.out.println('_' == findFirstNonRepeatingChar3("abba"));
        System.out.println('a' == findFirstNonRepeatingChar3("a"));
    }

    // O(n^2)
    private static char findFirstNonRepeatingChar1(String s) {
        if(s.length() == 1) {
            return s.charAt(0);
        }
        Set<Character> dupes = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                char c = s.charAt(i);
                if (dupes.contains(c)) {
                    break;
                } else if (c == s.charAt(j)) {
                    dupes.add(c);
                    break;
                } else if (j == s.length() - 1) {
                    return c;
                }
            }
        }
        return '_';
    }

    // O(2n)
    private static char findFirstNonRepeatingChar2(String s) {
        Map<Character, Integer> char_counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (char_counts.containsKey(c)) {
                char_counts.put(c, char_counts.get(c) + 1);
            } else {
                char_counts.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (char_counts.get(c) == 1) {
                return c;
            }
        }
        return '_';
    }

    // .indexOf() == .lastIndexOf()
    private static char findFirstNonRepeatingChar3(String s) {
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                return c;
            }
        }
        return '_';
    }
}