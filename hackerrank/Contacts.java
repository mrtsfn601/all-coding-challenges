package hackerrank;

import java.util.ArrayList;
import java.util.List;

// https://www.youtube.com/watch?v=vlYZb68kAY0
// https://www.hackerrank.com/challenges/contacts/problem
public class Contacts {
  private static class Node {
    private static final int NUMBER_OF_CHARACTERS = 26;
    Node[] children = new Node[NUMBER_OF_CHARACTERS];
    int count = 0;

    private static int getCharIndex(char c) {
      return c - 'a';
    }

    public Node getNode(char c) {
      return children[getCharIndex(c)];
    }

    public void setNode(char c, Node node) {
      children[getCharIndex(c)] = node;
    }

    public void add(String s) {
      add(s, 0);
    }

    public void add(String s, int index) {
      count++;
      if (s.length() == index) {
        return;
      }
      char current = s.charAt(index);
      Node child = getNode(current);
      if (child == null) {
        child = new Node();
        setNode(current, child);
      }
      child.add(s, index + 1);
    }

    public int getCount(String s) {
      return getCount(s, 0);
    }

    public int getCount(String s, int index) {
      if (s.length() == index) {
        return count;
      }
      char current = s.charAt(index);
      Node child = getNode(current);
      if (child == null) {
        return 0;
      }
      return child.getCount(s, index + 1);
    }
  }

  // Implementation with Trie - fast and furious in performance
  public static List<Integer> contacts(List<List<String>> queries) {
    List<Integer> result = new ArrayList<>();
    Node root = new Node();
    queries.forEach(
        q -> {
          String key = q.get(0);
          String val = q.get(1);
          if (key.equals("add")) {
            root.add(val);
          } else { // "find"
            result.add(root.getCount(val));
          }
        });
    return result;
  }
}
