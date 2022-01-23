package hackerrank;

// https://www.youtube.com/watch?v=oSWTXtMglKE
// https://www.youtube.com/watch?v=i_Q0v_Ct5lY
public class BinarySearchTree {

  public static class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
      this.data = data;
    }

    // Adds a new node
    public void add(int data) {
      if (this.data == data) {
        return;
      } else if (this.data > data) {
        if (left == null) {
          left = new Node(data);
        } else {
          left.add(data);
        }
      } else {
        if (right == null) {
          right = new Node(data);
        } else {
          right.add(data);
        }
      }
    }

    // Searches for matching data
    public boolean contains(int data) {
      if (this.data == data) {
        return true;
      } else if (data < this.data) {
        if (left == null) {
          return false;
        } else {
          return left.contains(data);
        }
      } else {
        if (right == null) {
          return false;
        } else {
          return right.contains(data);
        }
      }
    }

    // Checks if BST is BST
    public static boolean checkBST(Node root) {
      return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBST(Node root, int min, int max) {
      if (root == null) {
        return true;
      }
      if (root.data < min || max < root.data) {
        return false;
      }
      return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
    }

    // Counts height of the longest branch (option 1)
    public static int getHeight(Node root) {
      if (root == null) {
        return -1;
      }
      return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    // Counts height of the longest branch (option 2)
    public int getHeight2() {
      return getHeight2(0);
    }

    private int getHeight2(int count) {
      int leftCount = 0;
      int rightCount = 0;
      if (left != null) {
        leftCount = left.getHeight2(count + 1);
      }
      if (right != null) {
        rightCount = right.getHeight2(count + 1);
      }
      return Math.max(count, Math.max(leftCount, rightCount));
    }
  }
}
