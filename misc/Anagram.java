package misc;

import java.util.Arrays;

/**
 * Write a function that takes 2 non-empty strings, and checks if one string is an anagram of
 * another. Eg: health, earth -> true; aabc, abcc -> false.
 */
public class Anagram {

  public static boolean isAnagram(String original, String anagram) {

    if (original.length() != anagram.length()) return false;

    // original/anagram.toLowerCase().toCharArray() - for case insensitivity
    char[] originalArray = original.toCharArray();
    char[] anagramArray = anagram.toCharArray();

    Arrays.sort(originalArray);
    Arrays.sort(anagramArray);

    return Arrays.equals(originalArray, anagramArray);
  }
}
