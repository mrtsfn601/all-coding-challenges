package leetcode;

// LeetCode coding challenge: https://leetcode.com/problems/container-with-most-water/
// Two-pointer technique: https://leetcode.com/articles/two-pointer-technique/

public class ContainerWithMostWater_11 {

  public int maxArea(int[] arr) {
    int max = 0;
    int current = 0;
    int height = 0;
    int maxHeight = 0;
    int i = 0;
    int j = arr.length - 1;
    int left = 0;
    int right = 0;
    do {
      left = arr[i];
      right = arr[j];
      // get smaller wall
      height = left < right ? left : right;
      // if wall is taller than the previous highest, compute area, otherwise - skip
      if (maxHeight < height) {
        maxHeight = height;
        current = height * (j - i);
        if (max < current) {
          max = current;
        }
      }
      // keep taller wall in focus, and move on from smaller one
      if (left < right) {
        i++;
      } else if (left > right) {
        j--;
      } else {
        i++;
        j--;
      }
    } while (i < j);
    return max;
  }
}
