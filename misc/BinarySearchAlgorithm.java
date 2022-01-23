package misc;

// Recursive implementation of the Binary Search on array of integers and strings
public class BinarySearchAlgorithm {

  // Binary Search for array of integers
  public static boolean binarySearch(int[] arr, int target) {
    return binarySearch(arr, target, 0, arr.length - 1);
  }

  private static boolean binarySearch(int[] arr, int target, int left, int right) {
    int mid = (left + (right - left)) / 2;
    if (arr[mid] == target) {
      return true;
    } else if (target < arr[mid]) {
      return binarySearch(arr, target, left, mid - 1);
    } else {
      return binarySearch(arr, target, mid + 1, right);
    }
  }

  // Binary Search for array of strings
  public static boolean binarySearch(String[] arr, String target) {
    return binarySearch(arr, target, 0, arr.length - 1);
  }

  private static boolean binarySearch(String[] arr, String target, int left, int right) {
    int mid = (left + (right - left)) / 2;
    if (arr[mid].equals(target)) {
      return true;
    } else if (target.compareTo(arr[mid]) < 0) {
      return binarySearch(arr, target, left, mid - 1);
    } else {
      return binarySearch(arr, target, mid + 1, right);
    }
  }
}
