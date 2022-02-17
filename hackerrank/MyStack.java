package hackerrank;

// Implement Stack without Java collections
public class MyStack {

  Node top;

  public boolean isEmpty() {
    return top == null;
  }

  public int peek() {
    if (isEmpty()) {
      throw new NullPointerException("MyStack is empty");
    }
    return top.data;
  }

  public int pop() {
    if (isEmpty()) {
      throw new NullPointerException("MyStack is empty");
    }
    int data = top.data;
    top = top.next;
    return data;
  }

  public void push(int data) {
    Node node = new Node(data);
    node.next = top;
    top = node;
  }

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }
}
