package misc;

import java.util.Arrays;
import java.util.List;

/**
 * Write a function that returns a sentence with each word reversed, but in original order. Example
 * input: "Mary had a little lamb" Expected output: "yraM dah a elttil bmal"
 */
public class MaryHadALittleLamb {

  // Implementation with for-each and StringBuilder
  public static String reverseStringInOriginalOrder1(String text) {
    if (text == null) return "";

    String[] words = text.split("\\s+");
    StringBuilder result = new StringBuilder();
    StringBuilder reverser = new StringBuilder();

    for (String word : words) {
      reverser.append(word).reverse();
      result.append(reverser).append(" ");
      reverser.setLength(0);
    }

    return result.toString().trim();
  }

  // Implementation with Stream and Lambdas
  public static String reverseStringInOriginalOrder2(String text) {
    if (text == null) return ""; // check for null string

    // split string by below regexp separator
    // " +" any number of white spaces are treated as one
    List<String> wordList = Arrays.asList(text.split("\\s+"));
    StringBuilder result = new StringBuilder();
    StringBuilder reverser = new StringBuilder();

    wordList.forEach(
        word -> {
          reverser.append(word).reverse();
          result.append(reverser).append(" ");
          reverser.setLength(0); // empty reverser
        });

    // trim string to remove appended " " at the end
    return result.toString().trim();
  }
}
