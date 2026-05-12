class Solution {
    private int cols;
    private int rows;
    private boolean[][] isVisited;
    private int[][] grid;

    public int islandPerimeter(int[][] grid) {
        this.grid = grid;
        this.cols = grid[0].length;
        this.rows = grid.length;
        this.isVisited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    return dfs(i, j);
                }
            }
        }   
        return 0; 
    }

    private int dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= rows ||
            j >= cols || grid[i][j] == 0) {
            return 1;
        }
        if (isVisited[i][j]) {
            return 0;
        }
        isVisited[i][j] = true;
        return dfs(i, j + 1) + dfs(i + 1, j) +
               dfs(i, j - 1) + dfs(i - 1, j);

    }
}