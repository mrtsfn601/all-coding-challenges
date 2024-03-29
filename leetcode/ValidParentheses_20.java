package leetcode;

// https://leetcode.com/problems/valid-parentheses/
class ValidParentheses_20 {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(') stack.push(')');
      else if (c == '{') stack.push('}');
      else if (c == '[') stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c) return false;
    }
    return stack.isEmpty();
  }
}
