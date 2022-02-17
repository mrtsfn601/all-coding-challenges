package hackerrank;

// Implement Queue without Java collections
public class MyQueue {

  Node head;
  Node tail;

  public boolean isEmpty() {
    return head == null;
  }

  public int peek() {
    if (isEmpty()) {
      throw new NullPointerException("MyQueue is empty");
    }
    return head.data;
  }

  public int remove() {
    if (isEmpty()) {
      throw new NullPointerException("MyQueue is empty");
    }
    int data = head.data;
    if (head == tail) {
      head = null;
      tail = null;
    } else {
      head = head.next;
    }
    return data;
  }

  public void add(int data) {
    Node node = new Node(data);
    if (isEmpty()) {
      head = node;
    } else {
      tail.next = node;
    }
    tail = node;
  }

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }
}
