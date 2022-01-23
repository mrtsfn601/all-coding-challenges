package misc;

import java.util.HashSet;
import java.util.Set;

/**
 * Palindrome is the same word when you read it from the end to beginning. Write a program so that
 * it can verify it is a palindrome or not.
 *
 * <p>Palindromes: "kayak", "raceCAR", "a", "a a", "a$a", ""
 *
 * <p>Not palindrome: "abc", "ab a"
 */
public class PalindromeString {

  // representation of cashed requests, where could be kept frequently asked strings
  private static final Set<String> palindrome_cash = new HashSet<>();
  private static final Set<String> not_palindrome_cash = new HashSet<>();

  public static boolean idPalindrome(String text) {

    text = text.toLowerCase(); // following requirements: "raceCAR" is considered a palindrome

    // check for the result in cashed data
    if (palindrome_cash.contains(text)) {
      return true;
    }
    if (not_palindrome_cash.contains(text)) {
      return false;
    }

    // check for unequal chars from both ends
    for (int begin = 0, end = text.length() - 1; begin < end; begin++, end--) {

      if (text.charAt(begin) != text.charAt(end)) {

        not_palindrome_cash.add(text);
        return false;
      }
    }

    palindrome_cash.add(text);
    return true;
  }
}
