package leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 17. Letter Combinations of a Phone Number Given a string containing digits from 2-9 inclusive,
 * return all possible letter combinations that the number could represent. Return the answer in any
 * order. https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
public class LetterCombinationsOfPhoneNumber_17 {
  private static final int RESTRICTION_LENGTH = 4;
  private List<String> combinations = new LinkedList<>(List.of(""));

  public List<String> letterCombinations(String digits) {

    if (digits == null || digits.isEmpty()) {
      return Collections.emptyList();
    }

    if (digits.length() > RESTRICTION_LENGTH) {
      throw new IllegalArgumentException("Given string should have length 0-" + RESTRICTION_LENGTH);
    }

    for (char c : digits.toCharArray()) {

      switch (c) {
        case '2':
          addCombinations("a", "b", "c");
          break;
        case '3':
          addCombinations("d", "e", "f");
          break;
        case '4':
          addCombinations("g", "h", "i");
          break;
        case '5':
          addCombinations("j", "k", "l");
          break;
        case '6':
          addCombinations("m", "n", "o");
          break;
        case '7':
          addCombinations("p", "q", "r", "s");
          break;
        case '8':
          addCombinations("t", "u", "v");
          break;
        case '9':
          addCombinations("w", "x", "y", "z");
          break;
        default:
          continue;
      }
    }

    return combinations;
  }

  private void addCombinations(String... letters) {

    final List<String> newCombinations = new LinkedList<>();

    for (String string : combinations) {

      for (String letter : letters) {
        newCombinations.add(string + letter);
      }
    }

    combinations = newCombinations;
  }
}
