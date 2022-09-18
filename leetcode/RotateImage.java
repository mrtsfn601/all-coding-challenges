package leetcode;

/*
https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/

Rotate Image

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:

Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 
Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000
*/

class RotateImage {
    
    // solution #1
    public void rotate(int[][] matrix) {
        int end = matrix.length-1;
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = i; j < end - i; j++) {
                int buff = matrix[i][j];
                // move left to top
                matrix[i][j] = matrix[end-j][i];
                // move bottom to left
                matrix[end-j][i] = matrix[end-i][end-j];
                // move right to bottom
                matrix[end-i][end-j] = matrix[j][end-i];
                // move to top
                matrix[j][end-i] = buff;
            }
        }
    }
    
    // solution #2
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        // transpose matrix - turn rows to columns
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int buff = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buff;
            }
        }
        // swap columns
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len/2; j++) {
                int buff = matrix[i][j];
                matrix[i][j] = matrix[i][len-1-j];
                matrix[i][len-1-j] = buff;
            }
        }
    }
}
