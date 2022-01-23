package hackerrank;

import java.util.Stack;

/**
 * Balanced Brackets Interview Question Function takes string with brackets: {}[](). Returns true if
 * brackets are balanced, otherwise - false e.g.: '{}', '[]', and '()' - are balanced '{()}' and '{}
 * ()' - balanced '({])' - NOT balanced
 *
 * <p>Optional: Order is important: '({ )}' - NOT balanced.
 * https://www.hackerrank.com/challenges/balanced-brackets/problem
 * https://www.youtube.com/watch?v=IhJGJG-9Dx8
 * https://www.baeldung.com/java-balanced-brackets-algorithm
 */
public class BalancedBrackets {

  // OPTION 1: with String.replaceAll()
  public static String isBalanced1(String expression) {

    if (expression == null || expression.length() % 2 != 0) {
      return "NO";
    }

    while (expression.contains("()") || expression.contains("[]") || expression.contains("{}")) {
      expression =
          expression.replaceAll("\\(\\)", "").replaceAll("\\[\\]", "").replaceAll("\\{\\}", "");
    }

    return expression.isEmpty() ? "YES" : "NO";
  }

  // OPTION 2: with Stack data structure
  private static final char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

  public static String isBalanced2(String expression) {

    final Stack<Character> openingBrackets = new Stack<>();

    for (char c : expression.toCharArray()) {

      if (isOpening(c)) {
        openingBrackets.push(c);
      } else {
        if (openingBrackets.isEmpty() || !isMatching(openingBrackets.pop(), c)) {
          return "NO";
        }
      }
    }

    return openingBrackets.isEmpty() ? "YES" : "NO";
  }

  private static boolean isOpening(char c) {
    for (char[] arr : TOKENS) {
      if (arr[0] == c) {
        return true;
      }
    }
    return false;
  }

  private static boolean isMatching(char opening, char closing) {
    for (char[] arr : TOKENS) {
      if (arr[0] == opening) {
        return arr[1] == closing;
      }
    }
    return false;
  }
}
