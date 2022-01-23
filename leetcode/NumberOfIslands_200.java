package leetcode;

// https://leetcode.com/problems/number-of-islands/submissions/
public class NumberOfIslands_200 {
    private static final char SEA = '0';
    private static final char LAND = '1';
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == LAND) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    // Depth-First Search Algorithm
    private static void dfs(char[][] grid, int i, int j) {
        if (i < 0
                || i >= grid.length
                || j < 0
                || j >= grid[i].length
                || grid[i][j] == SEA) {
            return;
        }
        grid[i][j] = SEA;
        dfs(grid, i - 1, j); // move up
        dfs(grid, i + 1, j); // move down
        dfs(grid, i, j - 1); // move left
        dfs(grid, i, j + 1); // move right
    }
}
