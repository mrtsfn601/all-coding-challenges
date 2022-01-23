package misc;

// Palindrome: https://en.wikipedia.org/wiki/Palindrome
public class PalindromeNumber {

  // given number can be treated as number, that requires math
  public static boolean isPalindrome1(int original) {

    int reversed = 0;
    int mutable = original;

    while (mutable != 0) {
      reversed = reversed * 10 + mutable % 10;
      mutable /= 10;
    }

    return original == reversed;
  }

  // OR number can be treated as string, and we know how to deal with strings
  public static boolean isPalindrome2(int original) {

    String originalString = "" + Math.abs(original); // remove '-' in negative numbers

    return new StringBuilder(originalString).reverse().toString().equals(originalString);
  }
}
