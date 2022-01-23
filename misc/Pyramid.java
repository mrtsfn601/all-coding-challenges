package misc;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a java function that returns lines of stars so that when it is printed out, it displays a
 * Pyramid
 *
 * <p>ex: This list of stars will return a pyramid once it is print out line by line [ * , * * , * *
 * * , * * * * , * * * * * , * * * * * * , * * * * * * * , * * * * * * * * , * * * * * * * * * , * *
 * * * * * * * * * ]
 *
 * <p>output: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * *
 */
public class Pyramid {

  public static void main(String[] args) {
    printStars_ForLoop(10).forEach(System.out::println);

    printStars_RepeatMethod(10).forEach(System.out::println);
  }

  // solution with for loop
  public static List<String> printStars_ForLoop(int n) {
    List<String> tree = new ArrayList<>(n);

    StringBuilder string = new StringBuilder();

    for (int row = 0; row < n; row++) {

      string.setLength(0);

      for (int space = n - row; space > 0; space--) {
        string.append(" ");
      }

      for (int star = 0; star <= row; star++) {
        string.append("* ");
      }

      tree.add(string.toString());
    }

    return tree;
  }

  // in Java 11, solution can be simplified with string.repeat(n)
  public static List<String> printStars_RepeatMethod(int n) {
    List<String> pyramid = new ArrayList<>(n);

    for (int i = 0; i < n; i++) {
      pyramid.add(" ".repeat(n - i) + "* ".repeat(i + 1));
    }

    return pyramid;
  }
}
